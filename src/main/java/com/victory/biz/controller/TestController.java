package com.victory.biz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.victory.biz.model.ResultVo;
import com.victory.biz.model.TestVo;
import com.victory.system.util.HttpUrlConnectUtil;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class TestController {

	@Autowired
	HttpUrlConnectUtil apiCon;

	@PostMapping(value = "/apiConPostVo")
	public ResultVo apiConPostVo(@RequestBody TestVo param, @RequestHeader Map<String, Object> requestHeader)
			throws Exception {

		String resulturl = "http://127.0.0.1:8080/PostTest";

		ResultVo res = new ResultVo();
		try {

			res = apiCon.apiPost(resulturl, param, requestHeader, ResultVo.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	@PostMapping(value = "/apiConGetVo")
	public ResultVo apiConGetVo(@RequestBody TestVo param, @RequestHeader Map<String, Object> requestHeader)
			throws Exception {

		String resulturl = "http://127.0.0.1:8080/GetTest";

		ResultVo res = new ResultVo();
		try {

			res = apiCon.apiGet(resulturl, param, requestHeader, ResultVo.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}
}
