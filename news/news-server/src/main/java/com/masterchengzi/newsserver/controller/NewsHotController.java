package com.masterchengzi.newsserver.controller;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newsserver.service.NewsHotService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * User zjc
 * Created with IntelliJ IDEA
 * Created on 2018-10-15 13:59
 */

@RestController
@Log
@RequestMapping("NewsHot")
@Api(value = "NewsHotController ", description = "新闻热点表")
public class NewsHotController {
	@Autowired
	private NewsHotService newsHotService;

	/**
	 *
	 * @param newsId
	 * @param beginDate
	 * @param endDate
	 * @param title
	 * @param tag
	 * @return
	 */
	@ApiOperation(value = "获取列表")
	@GetMapping("/getNewsHot")
	public JsonResult getNewsHot(@RequestParam(name = "newsId") String newsId,
								 @RequestParam(name = "beginDate") Date beginDate,
								 @RequestParam(name = "endDate") Date endDate,
								 @RequestParam(name = "title") String title,
								 @RequestParam(name = "tag") String tag) {
		return newsHotService.getNewsHot(newsId, beginDate, endDate, title, tag);
	}
}
