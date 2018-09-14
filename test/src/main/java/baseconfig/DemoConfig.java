package baseconfig;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;

import control.*;

public class DemoConfig extends JFinalConfig{
	public void configConstant(Constants me) {
	       me.setDevMode(true);
	    }
	    public void configRoute(Routes me) {
			me.add("/api", ApiController.class);
			me.add("/jisne", JinseController.class);
			me.add("/okex", OkexApiController.class);
			me.add("zb", ZBApiController.class);
			me.add("/binance", BinanceController.class);
			me.add("/cex", CexController.class);
	    }
	    public void configEngine(Engine me) {}
	    public void configPlugin(Plugins me) {
		}
	    public void configInterceptor(Interceptors me) {}
	    public void configHandler(Handlers me) {
			me.add(new CORSHandler());
		}
}
