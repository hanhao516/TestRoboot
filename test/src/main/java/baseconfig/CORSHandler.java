package baseconfig;

import com.jfinal.handler.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CORSHandler extends Handler {
    @Override
    public void handle(String target, HttpServletRequest request,
                       HttpServletResponse response, boolean[] isHandled) {
        HttpServletResponse res = response;
        HttpServletRequest req= request;
        res.setContentType("textml;charset=UTF-8");
        res.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        res.setHeader("Access-Control-Max-Age", "0");
        res.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
        res.setHeader("Access-Control-Allow-Credentials", "true");
        res.setHeader("XDomainRequestAllowed","1");
        next.handle(target, request, response, isHandled);
    }

}
