package com.example.dockerJavaDemo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GroupsDTO {

	private Integer groupId;

	private String groupName;

	private String companyId;
	
	private String status;

}
