package com.example.dockerJavaDemo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


public class GroupsResponse extends CommonResponse{
	@JsonInclude(Include.NON_NULL)
	private ArrayList<GroupsDTO> groupDTO = new ArrayList<>();

	public ArrayList<GroupsDTO> getGroupDTO() {
		return groupDTO;
	}

	public void setGroupDTO(ArrayList<GroupsDTO> groupDTO) {
		this.groupDTO = groupDTO;
	}
}
