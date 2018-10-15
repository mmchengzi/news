package com.masterchengzi.newsserver.service.impl;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.common.ResultCode;
import com.masterchengzi.newsserver.dao.GetNewsDao;
import com.masterchengzi.newsserver.entity.GetNewsWithBLOBs;
import com.masterchengzi.newsserver.service.GetNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GetNewsServiceImpl implements GetNewsService {
	@Autowired
	private GetNewsDao getNewsDao;
	@Override
	public JsonResult getGetNews(String newsId, String title, String keyword, String tag, int isOld, Date beginDate, Date endDate) {
		try {
			List<GetNewsWithBLOBs> resultList= getNewsDao.getGetNews(newsId,title,keyword,tag,isOld,beginDate,endDate);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult delete(String newsId) {
		try {
			Integer resultList= getNewsDao.delete(newsId);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult insert(GetNewsWithBLOBs record) {
		try {
			Integer resultList= getNewsDao.insert(record);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}

	@Override
	public JsonResult update(GetNewsWithBLOBs record) {
		try {
			Integer resultList= getNewsDao.update(record);
			return new JsonResult(ResultCode.SUCCESS,"成功",resultList);
		}catch (Exception e){
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL,e.getMessage());
		}
	}
}
