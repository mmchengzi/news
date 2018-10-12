package com.masterchengzi.newsserver.dao.impl;

import com.masterchengzi.newsserver.dao.NewsMessDao;
import com.masterchengzi.newsserver.entity.NewsMess;

import java.util.List;

public class NewsMessDaoImpl implements NewsMessDao {
	@Override
	public List<NewsMess> getNewsMess(String newsId, String tag) {
		return null;
	}

	@Override
	public int delete(String newsId) {
		return 0;
	}

	@Override
	public int insert(NewsMess record) {
		return 0;
	}

	@Override
	public int update(NewsMess record) {
		return 0;
	}
}
