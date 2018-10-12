package com.masterchengzi.newsserver.dao.impl;

import com.masterchengzi.newsserver.dao.UserBehaviorDao;
import com.masterchengzi.newsserver.entity.UserBehavior;

import java.util.List;

public class UserBehaviorDaoImpl implements UserBehaviorDao {
	@Override
	public List<UserBehavior> getUserBehavior(String userId, String newsId, String newsTag) {
		return null;
	}

	@Override
	public int delete(String userId, String newsId) {
		return 0;
	}

	@Override
	public int insert(UserBehavior record) {
		return 0;
	}

	@Override
	public int update(UserBehavior record) {
		return 0;
	}
}
