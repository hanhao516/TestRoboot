package huobi;

import rest.IV1RestApi;
import rest.impl.V1RestApi;


public class V1Main {

	public static void main(String[] args) {
		IV1RestApi v1RestApi = (IV1RestApi) new V1RestApi();

		try {
			String ret = "";

			// ��ѯϵͳ֧�ֵ����н��׶Լ�����
			ret = v1RestApi.commonSymbols();
			System.out.println(ret);
//			
//			// ��ѯϵͳ֧�ֵ����б���
//			ret = v1RestApi.commonCurrencys();
//			System.out.println(ret);
//			
//			// ��ѯϵͳ��ǰʱ��
//			ret = v1RestApi.commonTimestamp();
//			System.out.println(ret);
//			long longTime = JSON.parseObject(ret).getLongValue("data");
//			System.out.println(new Date(longTime));
//			
//			// ��ѯ��ǰ�û��������˻�(��account-id)
			ret = v1RestApi.accounts();
			System.out.println(ret);
//			
//			// ��ѯ��ǰ�û��������˻�(��account-id)
//			ret = v1RestApi.accountsBalance("100512");
//			System.out.println(ret);
//			
//			// �µ�
//			ret = v1RestApi.place("100512", "1", "800", "api", "qtumusdt", "sell-limit");
//			System.out.println(ret);
//			
//			// ���볷��һ����������
//			ret = v1RestApi.submitcancel("707017938");
//			System.out.println(ret);
//			
//			// ������������
//			List<String> orderIds = new ArrayList<String>();
//			orderIds.add("707450476");
//			orderIds.add("707499914");
//			ret = v1RestApi.batchcancel(orderIds);
//			System.out.println(ret);
//			
//			// ��ѯĳ����������
//			ret = v1RestApi.orders("707450476");
//			System.out.println(ret);
//			
//			// ��ѯĳ�������ĳɽ���ϸ
//			ret = v1RestApi.matchresults("565214281");
//			System.out.println(ret);
//			
//			// ��ѯ��ǰί�С���ʷί��
//			ret = v1RestApi.orders("qtumusdt", null, null, null, "filled", null, null, null);
//			System.out.println(ret);
//
//			// ��ѯ��ǰ�ɽ�����ʷ�ɽ�
//			ret = v1RestApi.matchresults("qtumusdt", null, null, null, null, null, "50");
//			System.out.println(ret);
//			
//			// �ֻ��˻�����������˻�
//			ret = v1RestApi.transferInMargin("qtumusdt", "qtum", "1");
//			System.out.println(ret);
//			
//			// �ֻ��˻�����������˻�
//			ret = v1RestApi.transferOutMargin("qtumusdt", "qtum", "1");
//			System.out.println(ret);
			
			// ����˻�����
//			ret = v1RestApi.marginAccountsBalance(null);
//			System.out.println(ret);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
