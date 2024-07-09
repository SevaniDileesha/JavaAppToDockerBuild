package com.example.dockerJavaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DockerMessageController {
	   
	@Autowired
	private GroupServiceImpl groupServiceExtention;
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(DockerJavaDemoApplication.class);
	private static final Logger logger = LogManager.getLogger(DockerMessageController.class);

	@GetMapping("/messages")
	public String getMessage() {
		// LOGGER.info("hai");
		logger.info("mattek ");
		return "Hello from Docker!";
	}


	@GetMapping(value = "/groups")
	public ResponseEntity<CommonResponse> getExistingGroupsList() {

		GroupsResponse rsp = new GroupsResponse();
		ArrayList<GroupsDTO> groups = groupServiceExtention.getGroupsList();
				
		List<GroupsDTO> groupDTOList = groups;

		ArrayList<GroupsDTO> groupsList = new ArrayList<>(groupDTOList);
		
		rsp.setGroupDTO(groupsList);
		rsp.setReturnCode(HttpStatus.OK.value());
		rsp.setReturnMessage("Successfully retrieved the Groups for user" );
		logger.info("group response {}",rsp.getReturnMessage());
			return new ResponseEntity<>(rsp, HttpStatus.OK);
	}
}
