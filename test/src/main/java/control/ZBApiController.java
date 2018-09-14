package control;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import org.apache.http.HttpException;
import rest.IMarketRestApi;
import rest.impl.MarketRestApi;
import util.httpUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ZBApiController extends Controller {

    public void zbapi()  throws HttpException, IOException
    {
        String remoURL = "http://api.zb.com/data/v1/ticker";
        Map<String,String> paraMap = new HashMap<String, String>();
        String changKey = getPara("changKey");
        String secuiteKey = getPara("hiBitch8");
        paraMap.put("market",changKey);
        String remoteAddr = getRequest().getRemoteAddr();
        if (!remoteAddr.equals("127.0.0.1"))
        {
            if (!secuiteKey.equalsIgnoreCase("skjdf8234j2l34uj8dfu79283423rkj")) {
                renderJson("非法请求");
                return;
            }
        }

        IMarketRestApi marketRestApi = new MarketRestApi();
        // 获取K线数据
        JSONObject jsonObject = new JSONObject();
        try
        {
            jsonObject = JSONObject.parseObject(httpUtil.doPost(remoURL,paraMap));
        }catch (Exception e)
        {

        }
        renderJson(jsonObject);
    }
}
