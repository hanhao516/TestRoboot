package rest.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpException;

import rest.IMarketRestApi;
import util.HttpUtilManager;


public class MarketRestApi implements IMarketRestApi {

	private static String MARKET_URL = "https://api.huobipro.com";
	private static String OKEXMARKET_URL = "https://www.okex.com";
	private static String HADAX_URL= "https://api.hadax.com";
	private static String BINANCE_URL="https://api.binance.com";
	private static String CEX_URL="http://api.cex.plus";

	public String kline(String symbol, String period, String size) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);
		paramMap.put("period", period);
		paramMap.put("size", size);

		return httpUtil.requestHttpGet(MARKET_URL, "/market/history/kline", paramMap);
	}

	public String Cexkline(String symbol) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);

		return httpUtil.requestHttpGet(CEX_URL, "/api/v1/ticker.do", paramMap);
	}

	public String Binancekline(String symbol) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);
//		paramMap.put("interval", interval);
//		paramMap.put("limit", size);

		return httpUtil.requestHttpGet(BINANCE_URL, "/api/v1/ticker/24hr", paramMap);
	}

	public String hadaxKLine(String symbol, String period, String size) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);
		paramMap.put("period", period);
		paramMap.put("size", size);

		return httpUtil.requestHttpGet(HADAX_URL, "/market/history/kline", paramMap);
	}

	/**
	 * OKEX 币币行情
	 * @param symbol	交易对
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String okexBB(String symbol) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);

		return httpUtil.requestHttpGet(OKEXMARKET_URL, "/api/v1/ticker.do", paramMap);
	}

	public String merged(String symbol) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);

		return httpUtil.requestHttpGet(MARKET_URL, "/market/detail/merged", paramMap);
	}

	public String depth(String symbol, String type) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);
		paramMap.put("type", type);

		return httpUtil.requestHttpGet(MARKET_URL, "/market/depth", paramMap);
	}

	public String trade(String symbol) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);

		return httpUtil.requestHttpGet(MARKET_URL, "/market/trade", paramMap);
	}


	public String tradeHistory(String symbol, String size) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);
		paramMap.put("size", size);

		return httpUtil.requestHttpGet(MARKET_URL, "/market/history/trade", paramMap);
	}

	public String detail24(String symbol) throws HttpException, IOException {
		HttpUtilManager httpUtil = HttpUtilManager.getInstance();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("symbol", symbol);

		return httpUtil.requestHttpGet(MARKET_URL, "/market/detail", paramMap);
	}

}
