package com.example.dockerJavaDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {

	private int returnCode;
	private String returnMessage;
	
	private String errorCode;
	
}
