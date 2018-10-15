package com.masterchengzi.newsserver.controller;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.GetNewsWithBLOBs;
import com.masterchengzi.newsserver.entity.NAdmin;
import com.masterchengzi.newsserver.service.GetNewsService;
import com.masterchengzi.newsserver.service.NAdminService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * User zjc
 * Created with IntelliJ IDEA
 * Created on 2018-10-15 13:59
 */

@RestController
@Log
@RequestMapping("NAdmin")
@Api(value = "NAdminController", description = "后台管理员表")
public class NAdminController {
	@Autowired
	private NAdminService nAdminService;

	/**
	 *
	 * @param userId
	 * @return
	 */
	@ApiOperation(value = "获取管理员列表")
	@GetMapping("/getNAdmin")
	public JsonResult getNAdmin(@RequestParam(name = "id") int id,
								@RequestParam(name = "name") String name) {
		return nAdminService.getNAdmin(id,name);
	}

	@ApiOperation(value = "删除")
	@GetMapping("/delete")
	public JsonResult delete(@RequestParam(name = "id") int id) {
		return nAdminService.delete(id);
	}

	@ApiOperation(value = "新增")
	@GetMapping("/insert")
	public JsonResult insert(@ApiParam(value = "NAdmin") @RequestBody NAdmin record, HttpServletRequest request) {
		return nAdminService.insert(record);
	}

	@ApiOperation(value = "修改")
	@GetMapping("/update")
	public JsonResult update(@ApiParam(value = "NAdmin") @RequestBody NAdmin record, HttpServletRequest request) {
		return nAdminService.update(record);
	}
}