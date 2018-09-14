package control;

import util.HttpClientUtil;

public class maintest {

    public static void main(String[] args){
//        String url = "https://api.huobipro.com/market/history/kline?period=1day&size=2&symbol=htusdt";
        String url = "https://www.taobao.com/";
        String jsonStr = "{xxx}";
        String httpOrgCreateTestRtn = HttpClientUtil.doPost(url, jsonStr, "utf-8");
    }
}
