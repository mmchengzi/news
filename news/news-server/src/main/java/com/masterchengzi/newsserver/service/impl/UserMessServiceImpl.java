package com.masterchengzi.newsserver.service.impl;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.common.ResultCode;
import com.masterchengzi.newsserver.dao.UserMessDao;
import com.masterchengzi.newsserver.entity.UserMess;
import com.masterchengzi.newsserver.service.UserMessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMessServiceImpl implements UserMessService {
	@Autowired
	private UserMessDao userMessDao;
	@Override
	public JsonResult getUserMess(String userId) {
		try {
			List<UserMess> resultList= userMessDao.getUserMess(userId);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult delete(String userId) {
		try {
			Integer resultList= userMessDao.delete(userId);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult insert(UserMess record) {
		try {
			Integer resultList= userMessDao.insert(record);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult update(UserMess record) {
		try {
			Integer resultList= userMessDao.update(record);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}
}
