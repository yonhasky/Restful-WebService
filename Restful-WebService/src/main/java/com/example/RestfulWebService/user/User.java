package com.example.RestfulWebService.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFilter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value={"password"})
//@JsonFilter("UserInfo")
@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
public class User {

	private Integer id;

	@Size(min = 2, message = "name은 2글자 이상 입력")
	@ApiModelProperty(notes = "사용자 이름을 입력해주세요.")
	private String name;

	@Past
	@ApiModelProperty(notes = "사용자 등록일을 입력해주세요.")
	private Date joinDate;

	@ApiModelProperty(notes = "사용자 비밀번호를 입력해주세요.")
	private String password;

	@ApiModelProperty(notes = "사용자 주민번호를 입력해주세요.")
	// @JsonIgnore
	private String ssn;

}