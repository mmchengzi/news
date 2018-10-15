package com.masterchengzi.newsserver.controller;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.UserBehavior;
import com.masterchengzi.newsserver.service.UserBehaviorService;
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
@RequestMapping("UserBehavior")
@Api(value = "UserBehaviorController  ", description = "用户行为")
public class UserBehaviorController {
	@Autowired
	private UserBehaviorService userBehaviorService;

	/**
	 * @param newsId
	 * @return
	 */
	@ApiOperation(value = "获取列表")
	@GetMapping("/getUserBehavior")
	public JsonResult getUserBehavior(@RequestParam(name = "userId") String userId,
									  @RequestParam(name = "newsId") String newsId,
									  @RequestParam(name = "newsTag") String newsTag) {
		return userBehaviorService.getUserBehavior(userId, newsId, newsTag);
	}

	@ApiOperation(value = "删除")
	@GetMapping("/delete")
	public JsonResult delete(@RequestParam(name = "userId") String userId,
							 @RequestParam(name = "newsId") String newsId) {
		return userBehaviorService.delete(userId, newsId);
	}

	@ApiOperation(value = "新增")
	@GetMapping("/insert")
	public JsonResult insert(@ApiParam(value = "UserBehavior ") @RequestBody UserBehavior record, HttpServletRequest request) {
		return userBehaviorService.insert(record);
	}

	@ApiOperation(value = "修改")
	@GetMapping("/update")
	public JsonResult update(@ApiParam(value = "UserBehavior ") @RequestBody UserBehavior record, HttpServletRequest request) {
		return userBehaviorService.update(record);
	}
}