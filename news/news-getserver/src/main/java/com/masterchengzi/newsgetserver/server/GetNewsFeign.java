package com.masterchengzi.newsgetserver.server;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newsserver.entity.GetNewsWithBLOBs;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("newsServer/getNews")
public interface GetNewsFeign {

	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public JsonResult delete(@RequestParam(name = "newsId") String newsId);

	@RequestMapping(method = RequestMethod.POST, value = "/insert")
	public JsonResult insert(@RequestBody List<GetNewsWithBLOBs> record);
}
