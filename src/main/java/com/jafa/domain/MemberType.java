package com.jafa.domain;

import lombok.ToString;

@ToString
public enum MemberType {
	
	ROLE_ADMIN("관리자"), // 0
	ROLE_SUB_ADMIN("부관리자"), //1
	ROLE_REGULAR_MEMBER("정회원"), // 2
	ROLE_ASSOCIATE_MEMBER("준회원"); // 3

	private final String name;
	
	MemberType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
