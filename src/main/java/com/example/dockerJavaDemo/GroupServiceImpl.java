package com.example.dockerJavaDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GroupServiceImpl implements GroupService{

	
	@Autowired
	private GroupsRepository groupsRepository;
	
	@Override
	public ArrayList<GroupsDTO> getGroupsList() {

			List<Groups> groupList;

				groupList = groupsRepository.findAll();
			
			
			return convertGroupsToDTO(groupList);

		
	}

	private ArrayList<GroupsDTO> convertGroupsToDTO(List<Groups> groupList) {
		ArrayList<GroupsDTO> groupDto = new ArrayList<>();
	
			for (Groups group : groupList) {
	
				GroupsDTO groupsDTO = new GroupsDTO();
				groupsDTO.setGroupId(group.getGroupId());
				groupsDTO.setGroupName(group.getGroupName());
				groupsDTO.setCompanyId(group.getCompanyId());

				groupsDTO.setStatus(group.getStatus());

				groupDto.add(groupsDTO);
			}
	
		
		return groupDto;
	}

}
