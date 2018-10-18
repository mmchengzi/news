package com.masterchengzi.newsgetserver.common;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newsgetserver.server.GetNews;
import com.masterchengzi.newsgetserver.server.GetNewsFeign;
import com.masterchengzi.newsserver.entity.GetNewsWithBLOBs;
import lombok.extern.log4j.Log4j2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Log4j2
public class ScheduledTask {
	@Autowired
	private GetNews getNews;

	@Autowired
	private GetNewsFeign getNewsFeign;

	@Scheduled(fixedRate = 5000)
	public void get360News() {
		log.info("开始获取数据");
		JsonResult jsonResult = getNews.get360News("明星", "qq.com");
		if ("200".equals(jsonResult.getCode())) {
			String str = jsonResult.getData().toString();
			JSONObject myJsonObject = new JSONObject(str);
			if (!myJsonObject.get("retcode").equals("000000")) {
				return;
			}
			log.info(myJsonObject);
			JSONArray data = myJsonObject.getJSONArray("data");

			List<GetNewsWithBLOBs> newsWithBLOBsList = new ArrayList<>();
			for (int i = 0; i < data.length(); i++) {
				GetNewsWithBLOBs newsWithBLOBs = new GetNewsWithBLOBs();
				JSONObject job = data.getJSONObject(i);
				newsWithBLOBs.setNewsLink(job.getString("url"));
				newsWithBLOBs.setSource(job.getString("posterScreenName"));
				newsWithBLOBs.setTime(new Date());
				newsWithBLOBs.setImage(job.get("imageUrls").toString());
				newsWithBLOBs.setTitle(job.getString("title"));
				newsWithBLOBs.setTextContent(job.getString("content"));
				newsWithBLOBsList.add(newsWithBLOBs);
			}
			log.info("开始上传：" + newsWithBLOBsList.size());
			JsonResult result = getNewsFeign.insert(newsWithBLOBsList);
			log.info("成功获取新闻数：" + result.getData());
		}
	}
}