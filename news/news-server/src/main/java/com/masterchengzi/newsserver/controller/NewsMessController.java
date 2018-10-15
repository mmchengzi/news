package com.masterchengzi.newsserver.controller;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.NewsFeedback;
import com.masterchengzi.newsserver.entity.NewsMess;
import com.masterchengzi.newsserver.service.NewsFeedbackService;
import com.masterchengzi.newsserver.service.NewsMessService;
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
@RequestMapping("NewsMess")
@Api(value = "NewsMessController ", description = "新闻基本信息表")
public class NewsMessController {
	@Autowired
	private NewsMessService getNewsFeedback;

	/**
	 *
	 * @param newsId
	 * @param tag
	 * @return
	 */
	@ApiOperation(value = "获取列表")
	@GetMapping("/getNewsMess")
	public JsonResult getNewsMess(@RequestParam(name = "newsId") String newsId,
									 @RequestParam(name = "tag") String tag) {
		return getNewsFeedback.getNewsMess(newsId, tag);
	}

	@ApiOperation(value = "删除")
	@DeleteMapping("/delete")
	public JsonResult delete(@RequestParam(name = "newsId") String newsId) {
		return getNewsFeedback.delete(newsId);
	}

	@ApiOperation(value = "新增")
	@PostMapping("/insert")
	public JsonResult insert(@ApiParam(value = "NewsMess ") @RequestBody NewsMess record, HttpServletRequest request) {
		return getNewsFeedback.insert(record);
	}

	@ApiOperation(value = "修改")
	@PostMapping("/update")
	public JsonResult update(@ApiParam(value = "NewsMess ") @RequestBody NewsMess record, HttpServletRequest request) {
		return getNewsFeedback.update(record);
	}
}
