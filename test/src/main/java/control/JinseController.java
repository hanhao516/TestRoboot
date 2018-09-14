package control;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import util.HttpUtilManager;

import java.util.HashMap;
import java.util.Map;

public class JinseController extends Controller{

    String urlHead = "https://api.jinse.com/";
    String urlContent = "live/list";

    public void getJinseFastApi()
    {
        String secuiteKey = getPara("hiBitch8");
        if (null == secuiteKey)
        {
            renderJson("非法请求");
            return;
        }
        if (!secuiteKey.equalsIgnoreCase("skjdf8234j2l34uj8dfu79283423rkj")) {
            renderJson("非法请求");
            return;
        }

        Map<String, String> paramMap = new HashMap<String, String>();
        String limit = getPara("limit");
        paramMap.put("limit",limit == null?"5":limit);
        String fastInfoId = getPara("id");
        if (null != fastInfoId)
        {
            paramMap.put("id",fastInfoId == null?"0":fastInfoId);
        }

        HttpUtilManager httpUtil = HttpUtilManager.getInstance();
        String jinseFastInfo = "";
        try
        {
            jinseFastInfo = httpUtil.requestHttpGet(urlHead, urlContent, paramMap);
        }catch (Exception e)
        {
            jinseFastInfo = "";
        }
        renderJson(JSONObject.parseObject(jinseFastInfo));
    }

/*    public void returnJinSeApiInfo()
    {
        JSONObject jsonObject = JSONObject.parseObject(getJinseFastApi());
        JSONArray jsonArray = (JSONArray)jsonObject.get("list");
        JSONObject jsonFastObject = (JSONObject)jsonArray.get(0);
        String dateInfo = jsonFastObject.getString("date");
        JSONArray jsonInfoArray = (JSONArray)jsonFastObject.get("lives");

    }*/

}
