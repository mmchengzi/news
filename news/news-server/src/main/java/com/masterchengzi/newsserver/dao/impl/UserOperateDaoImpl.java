package com.masterchengzi.newsserver.dao.impl;

import com.masterchengzi.newsserver.dao.UserOperateDao;
import com.masterchengzi.newsserver.entity.UserOperate;

import java.util.List;

public class UserOperateDaoImpl implements UserOperateDao {
	@Override
	public List<UserOperate> getUserOperate(String userId, String newsId) {
		return null;
	}

	@Override
	public int delete(String userId, String newsId) {
		return 0;
	}

	@Override
	public int insert(UserOperate record) {
		return 0;
	}

	@Override
	public int update(UserOperate record) {
		return 0;
	}
}
