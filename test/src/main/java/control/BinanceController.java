package control;

import com.alibaba.fastjson.JSON;
import com.jfinal.core.Controller;
import org.apache.http.HttpException;
import rest.IMarketRestApi;
import rest.impl.MarketRestApi;

import java.io.IOException;

public class BinanceController extends Controller{
    public void hello() throws HttpException, IOException {
        String secuiteKey = getPara("hiBitch8");
        String remoteAddr = getRequest().getRemoteAddr();
        if (!remoteAddr.equals("127.0.0.1"))
        {
            if (!secuiteKey.equalsIgnoreCase("skjdf8234j2l34uj8dfu79283423rkj")) {
                renderJson("非法请求");
                return;
            }
        }
        String changKey = getPara("symbol");
//        String timeKey = getPara("interval");
//        String count = getPara("limit");

        IMarketRestApi marketRestApi = new MarketRestApi();
        // 获取K线数据
        String ret = marketRestApi.Binancekline(changKey);
        renderJson(JSON.parseObject(ret));
    }
}
