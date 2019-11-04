package ci.xu.crawlerbase.domain;


import ci.xu.crawlerbase.biz.domain.util.HttpsTools;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


@SpringBootTest
class VipApplicationTests {

    @Autowired
    HttpsTools httpsTools;


    @Test
    void contextLoads() throws IOException {
        long startTime = System.currentTimeMillis();
        //定义变量，保存两个字母
        List<String> domains = httpsTools.getNameList("", "", 2, "re");
        Random random = new Random();
        List<String> buyList = new ArrayList<>();
        for (int i = 1; i <= domains.size(); i++) {
            String domain = domains.get(i - 1);
            HashMap<String, Object> param = new HashMap<>();
            param.put("domainname", domain);

            try {
//                Thread.sleep(random.nextInt(1000));
                String s = httpsTools.sendPostMapDomain("http://domain.ourui.com/reg/domainquery.asp", param);
                if (s.equals("Y")) {
                    System.out.println("************************************************************  "+domain);
                    buyList.add(domain);
                }
                System.out.println(LocalDateTime.now() + " " + domain + " ---- " + i + "/" + domains.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        buyList.forEach(i-> System.out.println(i));

//        String s = httpsTools.sendGet("http://dy.mkxiu.cn/bt/?url=https://v.youku.com/v_show/id_XNDI3OTc1MzQyNA==.html");
//        System.out.println(s);
//        String post="http://dy.mkxiu.cn/bt/api.php";
//        HashMap<String, Object> map=new HashMap<String, Object>();
//        map.put("url","");
//        map.put("referer","aHR0cDovL3NwLjYwODBqeC5jb20vP3VybD1odHRwczovL3YueW91a3UuY29tL3Zfc2hvdy9pZF9YTkRJM09UYzFNelF5TkE9PS5odG1s");
//        map.put("ref","0");
//        map.put("time","");
//        map.put("type","");//可以空
//        map.put("other","");
//        map.put("ref","0");
//        map.put("token","");
//        map.put("keep","");
//        map.put("key","f11cd7558346a7c4409b74a60e1d7173");
//
//        System.out.println(httpsTools.sendPostMap(post, map));


        /*String url="http://www.156zy.co/index.php?m=vod-search";
        HashMap<String, Object> map=new HashMap<String, Object>();
        map.put("wd","鬼");
        map.put("submit","search");
        String result= httpsTools.sendPostMap(url,map);
        String contxt=result.substring(result.indexOf("<i class=\"arrow\"><b class=\"a_outer\"></b><b class=\"a_inner\"></b></i>"),result.lastIndexOf("<!-- 底部截取标签-->"));

        System.out.println(contxt);*/

        /*String url="http://qinglv.muat.love/index.php";
        HashMap<String, Object> map=new HashMap<String, Object>();
        for (int i = 0; i < 1000; i++) {
        map.put("u",Math.random());
        map.put("p",Math.random());
        map.put("bianhao","852");
        String s = httpsTools.sendPostMap(url, map);
        System.out.println(s);
        }*/
        System.out.println("耗时:" + (System.currentTimeMillis() - startTime));
    }


}
