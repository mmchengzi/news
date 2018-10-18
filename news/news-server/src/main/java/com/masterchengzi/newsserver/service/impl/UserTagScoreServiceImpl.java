package com.masterchengzi.newsserver.service.impl;
import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newscommon.common.ResultCode;
import com.masterchengzi.newsserver.dao.UserTagScoreDao;
import com.masterchengzi.newsserver.entity.UserTagScore;
import com.masterchengzi.newsserver.service.UserTagScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTagScoreServiceImpl implements UserTagScoreService {
	@Autowired
	private UserTagScoreDao userTagScoreDao;
	@Override
	public JsonResult getUserTagScore(String userId) {
		try {
			List<UserTagScore> resultList= userTagScoreDao.getUserTagScore(userId);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult delete(String userId) {
		try {
			Integer resultList= userTagScoreDao.delete(userId);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult insert(UserTagScore record) {
		try {
			Integer resultList= userTagScoreDao.insert(record);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult update(UserTagScore record) {
		try {
			Integer resultList= userTagScoreDao.update(record);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}
}
