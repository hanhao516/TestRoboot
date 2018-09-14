package rest;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.http.HttpException;

public interface IV1RestApi {

	/**
	 * ��ѯϵͳ֧�ֵ����н��׶Լ�����
	 * 
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String commonSymbols() throws HttpException, IOException;

	/**
	 * ��ѯϵͳ֧�ֵ����б���
	 * 
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String commonCurrencys() throws HttpException, IOException;

	/**
	 * ��ѯϵͳ��ǰʱ��
	 * 
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String commonTimestamp() throws HttpException, IOException;
	
	/**
	 * ��ѯ��ǰ�û��������˻�(��account-id)
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String accounts() throws HttpException, IOException;
	
	/**
	 * ��ѯָ���˻������
	 * @param accountId	�˻� ID
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String accountsBalance(String accountId) throws HttpException, IOException;
	

	/**
	 * �µ�
	 * @param accountId	�˻� ID
	 * @param amount	�޼۵���ʾ�µ��������м���ʱ��ʾ�����Ǯ���м�����ʱ��ʾ�����ٱ�	
	 * @param price	�µ��۸��м۵������ò���
	 * @param source	������Դ		Ĭ��api�����ʹ�ý���ʲ����ף�����д��margin-api��
	 * @param symbol	���׶�
	 * @param type	��������	buy-market���м���, sell-market���м���, buy-limit���޼���, sell-limit���޼���
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String place(String accountId, String amount, String price, String source, String symbol, String type) throws HttpException, IOException;
	
	public String place(String accountId, BigDecimal amount, BigDecimal price, String source, String symbol, String type) throws HttpException, IOException;
	
	/**
	 * ���볷��һ����������
	 * @param orderId		����ID
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String submitcancel(String orderId) throws HttpException, IOException;
	
	/**
	 * ������������
	 * @param orderIds	��������ID�б�
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String batchcancel(List<String> orderIds) throws HttpException, IOException;
	
	/**
	 * ��ѯĳ����������
	 * @param orderId	����ID
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String orders(String orderId) throws HttpException, IOException;
		
	/**
	 * ��ѯĳ�������ĳɽ���ϸ
	 * @param orderId	����ID
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String matchresults(String orderId) throws HttpException, IOException;
	
	/**
	 * ��ѯ��ǰί�С���ʷί��
	 * @param symbol	���׶�
	 * @param types	��ѯ�Ķ���������ϣ�ʹ��','�ָ�	buy-market���м���, sell-market���м���, buy-limit���޼���, sell-limit���޼���
	 * @param startDate	��ѯ��ʼ����, ���ڸ�ʽyyyy-mm-dd
	 * @param endDate	��ѯ��������, ���ڸ�ʽyyyy-mm-dd
	 * @param states	��ѯ�Ķ���״̬��ϣ�ʹ��','�ָ�		pre-submitted ׼���ύ, submitted ���ύ, partial-filled ���ֳɽ�, partial-canceled ���ֳɽ�����, filled ��ȫ�ɽ�, canceled �ѳ���
	 * @param from	��ѯ��ʼ ID
	 * @param direct	��ѯ����		prev ��ǰ��next ���
	 * @param size	��ѯ��¼��С
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String orders(String symbol, String types, String startDate, String endDate, String states,String from, String direct,String size) throws HttpException, IOException;
	
	/**
	 * ��ѯ��ǰ�ɽ�����ʷ�ɽ�
	 * @param symbol	���׶�
	 * @param types	��ѯ�Ķ���������ϣ�ʹ��','�ָ�	buy-market���м���, sell-market���м���, buy-limit���޼���, sell-limit���޼���
	 * @param startDate	��ѯ��ʼ����, ���ڸ�ʽyyyy-mm-dd
	 * @param endDate	��ѯ��������, ���ڸ�ʽyyyy-mm-dd
	 * @param from	��ѯ��ʼ ID
	 * @param direct	��ѯ����		prev ��ǰ��next ���
	 * @param size	��ѯ��¼��С
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String matchresults(String symbol, String types, String startDate, String endDate, String from, String direct,String size) throws HttpException, IOException;
	
	/**
	 * �ֻ��˻�����������˻�
	 * @param symbol	���׶�
	 * @param currency	����
	 * @param amount
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String transferInMargin(String symbol, String currency, String amount) throws HttpException, IOException;
	
	/**
	 * ����˻��������ֻ��˻�
	 * @param symbol	���׶�
	 * @param currency	����
	 * @param amount	���
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String transferOutMargin(String symbol, String currency, String amount) throws HttpException, IOException;
	
	/**
	 * ������
	 * @param symbol	���׶�
	 * @param currency	����
	 * @param amount	���
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String marginOrders(String symbol, String currency, String amount) throws HttpException, IOException;
	
	/**
	 * �黹���
	 * @param orderId	������� ID
	 * @param amount	������
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String marginOrdersRepay(String orderId, String amount) throws HttpException, IOException;
	
	/**
	 * �������
	 * @param symbol	���׶�
	 * @param currency	����
	 * @param startDate	��ѯ��ʼ����, ���ڸ�ʽyyyy-mm-dd
	 * @param endDate	��ѯ��������, ���ڸ�ʽyyyy-mm-dd
	 * @param states ״̬
	 * @param from	��ѯ��ʼ ID
	 * @param direct	��ѯ����		prev ��ǰ��next ���
	 * @param size	��ѯ��¼��С
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String marginLoanOrders(String symbol, String currency, String startDate, String endDate, String states, String from, String direct,String size) throws HttpException, IOException;
	
	
	/**
	 * ����˻�����
	 * @param symbol	���׶�
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String marginAccountsBalance(String symbol) throws HttpException, IOException;
	
	/**
	 * �������������
	 * @param address	���ֵ�ַ
	 * @param amount		�������
	 * @param currency	�ʲ�����
	 * @param fee	ת��������	
	 * @param addrTag	����ҹ����ַtag��XRP����
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public String withdraw(String address, String amount, String currency, String fee, String addrTag) throws HttpException, IOException;
	
}
