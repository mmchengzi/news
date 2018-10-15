package com.masterchengzi.newsserver.controller;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.User;
import com.masterchengzi.newsserver.entity.UserOperate;
import com.masterchengzi.newsserver.service.UserOperateService;
import com.masterchengzi.newsserver.service.UserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * User zjc
 * Created with IntelliJ IDEA
 * Created on 2018-10-15 13:59
 */

@RestController
@Log
@RequestMapping("User")
@Api(value = "UserController ", description = "用户")
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 *
	 * @param userId
	 * @param name
	 * @param phone
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	@ApiOperation(value = "获取列表")
	@GetMapping("/getUser")
	public JsonResult getUser(@RequestParam(name = "userId") String userId,
									 @RequestParam(name = "name") String name,
									 @RequestParam(name = "phone") String phone,
									 @RequestParam(name = "beginDate") Date beginDate,
									 @RequestParam(name = "endDate") Date endDate) {
		return userService.getUser(userId,name,phone,beginDate,endDate);
	}

	@ApiOperation(value = "分页获取列表")
	@GetMapping("/getPageUser")
	public JsonResult getPageUser(@RequestParam(name = "userId") String userId,
							  @RequestParam(name = "name") String name,
							  @RequestParam(name = "phone") String phone,
							  @RequestParam(name = "beginDate") Date beginDate,
							  @RequestParam(name = "endDate") Date endDate,
							  @RequestParam(name = "pageNum") int pageNum,
							  @RequestParam(name = "pageSize") int pageSize) {
		return userService.getPageUser(userId,name,phone,beginDate,endDate,pageNum,pageSize);
	}

	@ApiOperation(value = "删除")
	@GetMapping("/delete")
	public JsonResult delete(@RequestParam(name = "userId") String userId,
							 @RequestParam(name = "name") String name,
							 @RequestParam(name = "phone") String phone) {
		return userService.delete(userId, name, phone);
	}

	@ApiOperation(value = "新增")
	@GetMapping("/insert")
	public JsonResult insert(@ApiParam(value = "User") @RequestBody User record, HttpServletRequest request) {
		return userService.insert(record);
	}

	@ApiOperation(value = "修改")
	@GetMapping("/update")
	public JsonResult update(@ApiParam(value = "User") @RequestBody User record, HttpServletRequest request) {
		return userService.update(record);
	}
}
