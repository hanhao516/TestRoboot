package control;

import java.sql.Date;

import util.HttpClientUtil;
import util.HttpUtilCSDN;

public class maintest {

    public static void main(String[] args){
    	java.util.Date dateNowDate = new java.util.Date();
    	String timeStr13 = dateNowDate.getTime() + "";
    	String time13Substring = timeStr13.substring(0, 10) + "." + timeStr13.substring(10,13);
    	
    	String timeStr13Before4 = (dateNowDate.getTime() - (4 * 24 * 60 * 60 * 1000)) + "";
    	String time13SubstrBefore4 = timeStr13Before4.substring(0, 10) + "." + timeStr13Before4.substring(10,13);

    	String url = "https://tokenview.com/v2api/trading/dots/eth/"+ time13SubstrBefore4 +"/?endTime=" + time13Substring;
        String jsonStr = "{xxx}";
        String httpOrgCreateTestRtn = HttpUtilCSDN.doGet(url);
        System.out.println("123");
    }
}
