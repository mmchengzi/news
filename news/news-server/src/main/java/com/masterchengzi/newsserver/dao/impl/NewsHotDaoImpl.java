package com.masterchengzi.newsserver.dao.impl;

import com.masterchengzi.newsserver.dao.NewsHotDao;
import com.masterchengzi.newsserver.entity.NewsHot;
import com.masterchengzi.newsserver.mapper.NewsHotMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class NewsHotDaoImpl implements NewsHotDao {
	@Autowired
	private NewsHotMapper getNewsFeedback;
	@Override
	public List<NewsHot> getNewsHot(String newsId, Date time, String title, String tag) {
		Map map = new HashMap();
		map.put("newsId", newsId);
		map.put("time", time);
		map.put("title", title);
		map.put("tag", tag);
		return getNewsFeedback.getNewsHot(map);
	}
}
