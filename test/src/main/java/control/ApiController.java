package control;

import java.io.IOException;

import com.jfinal.log.Log;
import org.apache.http.HttpException;

import rest.IMarketRestApi;
import rest.impl.MarketRestApi;

import com.alibaba.fastjson.JSON;
import com.jfinal.core.Controller;
import com.jfinal.json.FastJson;

import util.HttpClientUtil;

public class ApiController extends Controller {
	
	public void hello() throws HttpException, IOException {
//		getResponse().addHeader("Access-Control-Allow-Origin", "*");
		String secuiteKey = getPara("hiBitch8");
		String remoteAddr = getRequest().getRemoteAddr();
		if (!remoteAddr.equals("127.0.0.1"))
		{
			if (!secuiteKey.equalsIgnoreCase("skjdf8234j2l34uj8dfu79283423rkj")) {
				renderJson("非法请求");
				return;
			}
		}
		String changKey = getPara("changKey");
		String timeKey = getPara("timeKey");
		String count = getPara("countKey");
		
		IMarketRestApi marketRestApi = new MarketRestApi();
			// 获取K线数据
		String ret = marketRestApi.kline(changKey, timeKey, count);
		renderJson(JSON.parseObject(ret));
	}

	public void hadax() throws HttpException, IOException {
		String secuiteKey = getPara("hiBitch8");
		String remoteAddr = getRequest().getRemoteAddr();
		if (!remoteAddr.equals("127.0.0.1"))
		{
			if (!secuiteKey.equalsIgnoreCase("skjdf8234j2l34uj8dfu79283423rkj")) {
				renderJson("非法请求");
				return;
			}
		}
		String changKey = getPara("changKey");
		String timeKey = getPara("timeKey");
		String count = getPara("countKey");

		IMarketRestApi marketRestApi = new MarketRestApi();
		// 获取K线数据
		String ret = marketRestApi.hadaxKLine(changKey, timeKey, count);
		renderJson(JSON.parseObject(ret));
	}



}
