package huobi;

import java.io.IOException;

import org.apache.http.HttpException;

import rest.IMarketRestApi;
import rest.impl.MarketRestApi;


public class MarketMain {

	public static void main(String[] args) {
		IMarketRestApi marketRestApi = new MarketRestApi();

		try {
			// ��ȡK������
			String ret = marketRestApi.kline("btcusdt", "1min", "10");
			System.out.println(ret);

			// ��ȡ�ۺ�����(Ticker)
			ret = marketRestApi.merged("btcusdt");
			System.out.println(ret);

			// ��ȡ Market Depth ����
			ret = marketRestApi.depth("btcusdt", "step0");
			System.out.println(ret);

			// ��ȡ Trade Detail ����
			ret = marketRestApi.trade("btcusdt");
			System.out.println(ret);

			// ������ȡ����Ľ��׼�¼
			ret = marketRestApi.tradeHistory("btcusdt", "10");
			System.out.println(ret);

			// ��ȡ Market Detail 24Сʱ�ɽ�������
			ret = marketRestApi.detail24("btcusdt");
			System.out.println(ret);

		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
