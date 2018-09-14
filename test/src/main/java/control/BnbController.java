package control;

import com.alibaba.fastjson.JSON;
import com.jfinal.core.Controller;
import org.apache.http.HttpException;
import rest.IMarketRestApi;
import rest.impl.MarketRestApi;

import java.io.IOException;

public class BnbController extends Controller{
    public void getOkexTicker() throws HttpException, IOException {
        String secuiteKey = getPara("hiBitch8");
        if (!secuiteKey.equalsIgnoreCase("skjdf8234j2l34uj8dfu79283423rkj")) {
            renderJson("非法请求");
            return;
        }
        String changKey = getPara("changKey");

        IMarketRestApi marketRestApi = new MarketRestApi();
        // 获取K线数据
//		String ret = marketRestApi.kline("btcusdt", "1day", "10");
        String ret = marketRestApi.okexBB(changKey);
//		System.out.println(ret);
        renderJson(JSON.parseObject(ret));
    }
}
