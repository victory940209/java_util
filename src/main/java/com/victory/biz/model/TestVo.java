package com.victory.biz.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TestVo {

	@JsonProperty("test")
	private String test;

	@JsonProperty("test2")
	private String test2;

	@JsonProperty("test3")
	private String test3;

	@JsonProperty("test4")
	private int test4;

}
