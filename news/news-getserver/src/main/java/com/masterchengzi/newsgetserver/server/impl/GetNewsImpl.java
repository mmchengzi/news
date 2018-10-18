package com.masterchengzi.newsgetserver.server.impl;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newscommon.common.ResultCode;
import com.masterchengzi.newsgetserver.common.HttpUtils;
import com.masterchengzi.newsgetserver.server.GetNews;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class GetNewsImpl implements GetNews {

	@Value("${idataapi.Url360}")
	private String Url360;
	@Value("${idataapi.cctvUrl}")
	private String cctvUrl;
	@Value("${juhe.PathUrl}")
	private String JuheUrl;
	/**
	 *
	 * @param kw
	 * @param site
	 * @return
	 */
	@Override
	public JsonResult get360News(String kw, String site) {

		try {
			StringBuffer url=new StringBuffer();
			url.append(Url360);
			if(kw !=null&&kw.length()>0){
				url.append("&kw="+kw);
			}
			if(site !=null&&site.length()>0){
				url.append("&site="+site);
			}
			JSONObject json = HttpUtils.getRequestFromUrl(url.toString());
			return new JsonResult(ResultCode.SUCCESS, "成功", json);
		} catch (Exception e) {
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL, e.getMessage());
		}
	}

	/**
	 * @param kw        关键字
	 * @param beginDate 只有按关键词搜索时该参数生效
	 * @param endDate   只有按关键词搜索时该参数生效
	 * @param city      只有按关键词搜索时该参数生效
	 * @return
	 */
	@Override
	public JsonResult getCCTVNews(String kw, String beginDate, String endDate, String city) {
		try {
			StringBuffer url=new StringBuffer();
			url.append(cctvUrl);
			if(kw !=null&&kw.length()>0){
				url.append("&kw="+kw);
			}
			if(beginDate !=null&&beginDate.length()>0){
				url.append("&beginDate="+beginDate);
			}
			if(endDate !=null&&endDate.length()>0){
				url.append("&endDate="+endDate);
			}
			if(city !=null&&city.length()>0){
				url.append("&city="+city);
			}
			JSONObject json = HttpUtils.getRequestFromUrl(url.toString());
			return new JsonResult(ResultCode.SUCCESS, "成功", json);
		} catch (Exception e) {
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL, e.getMessage());
		}
	}

	@Override
	public JsonResult getJuheNews(String type) {
		try {
			String url = JuheUrl + type;
			JSONObject json = HttpUtils.getRequestFromUrl(url);
			return new JsonResult(ResultCode.SUCCESS, "成功", json);
		} catch (Exception e) {
			e.printStackTrace();
			return new JsonResult(ResultCode.FAIL, e.getMessage());
		}
	}
}
