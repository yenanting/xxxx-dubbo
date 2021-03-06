package com.xxxx.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxxx.mybatis.domain.Enterprise;
import com.xxxx.repo.IEnterpriseService;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
	 @Resource
	 IEnterpriseService enterpriseService;
	 
	 @RequestMapping("/getname")
	 @ResponseBody
	 public Enterprise getName(){
		 return enterpriseService.getEnterpriseById(1);
	 }
}
