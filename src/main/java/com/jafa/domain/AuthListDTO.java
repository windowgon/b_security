package com.jafa.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class AuthListDTO {
	private List<AuthVO> authList;
}
