package rest;

import java.io.IOException;
import java.util.Date;

import org.apache.http.HttpException;


public interface IMarketRestApi {
	/**
	 * ��ȡK������
	 * @param symbol	���׶�
	 * @param period	K������	1min, 5min, 15min, 30min, 60min, 1day, 1mon, 1week, 1year
	 * @param size		��ȡ���� [1,2000]
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String kline(String symbol, String period, String size) throws HttpException, IOException;

	public String Binancekline(String symbol) throws HttpException, IOException;

	public String hadaxKLine(String symbol, String period, String size) throws HttpException, IOException;
	/**
	 * OKEX �ұ�����
	 * @param symbol	���׶�
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String okexBB(String symbol) throws HttpException, IOException;

	/**
	 * ��ȡ�ۺ�����
	 * @param symbol	���׶�
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String merged(String symbol) throws HttpException, IOException;
	
	/**
	 * ��ȡ Market Depth ����
	 * @param symbol	���׶�
	 * @param type	step0, step1, step2, step3, step4, step5���ϲ����0-5����step0ʱ�����ϲ����
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String depth(String symbol, String type) throws HttpException, IOException;
	
	/**
	 * ��ȡ Trade Detail ����
	 * @param symbol	���׶�
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String trade(String symbol) throws HttpException, IOException;
	
	/**
	 * ������ȡ����Ľ��׼�¼
	 * @param symbol	���׶�
	 * @param size 	��ȡ���׼�¼������ 	[1, 2000]
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String tradeHistory(String symbol, String size) throws HttpException, IOException;
	
	
	/**
	 * ��ȡ Market Detail 24Сʱ�ɽ�������
	 * @param symbol	���׶�
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String detail24(String symbol) throws HttpException, IOException;

	public String Cexkline(String symbol) throws HttpException, IOException;
}
