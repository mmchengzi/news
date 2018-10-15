package com.masterchengzi.newsserver.controller;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.UserLoveTag;
import com.masterchengzi.newsserver.entity.UserMess;
import com.masterchengzi.newsserver.service.UserLoveTagService;
import com.masterchengzi.newsserver.service.UserMessService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * User zjc
 * Created with IntelliJ IDEA
 * Created on 2018-10-15 13:59
 */

@RestController
@Log
@RequestMapping("UserMess")
@Api(value = "UserMessController ", description = "用户基本信息")
public class UserMessController {
	@Autowired
	private UserMessService userMessService;

	/**
	 *
	 * @param userId
	 * @return
	 */
	@ApiOperation(value = "获取列表")
	@GetMapping("/getUserMess")
	public JsonResult getUserMess(@RequestParam(name = "userId") String userId) {
		return userMessService.getUserMess(userId);
	}

	@ApiOperation(value = "删除")
	@GetMapping("/delete")
	public JsonResult delete(@RequestParam(name = "userId") String userId) {
		return userMessService.delete(userId);
	}

	@ApiOperation(value = "新增")
	@GetMapping("/insert")
	public JsonResult insert(@ApiParam(value = "UserMess ") @RequestBody UserMess record, HttpServletRequest request) {
		return userMessService.insert(record);
	}

	@ApiOperation(value = "修改")
	@GetMapping("/update")
	public JsonResult update(@ApiParam(value = "UserMess ") @RequestBody UserMess record, HttpServletRequest request) {
		return userMessService.update(record);
	}
}
