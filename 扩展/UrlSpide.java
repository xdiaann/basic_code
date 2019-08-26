/*
package 扩展;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UrlSpide {

    public static void main(String[] args) throws Exception{
        //https://search.jd.com/Search?keyword=%E5%8D%8E%E7%A1%95%E7%94%B5%E8%84%91&enc=utf-8&wq=%E5%8D%8E%E4%B8%BA%E7%94%B5%E8%84%91&pvid=ff2f9b2d524e458ebf2a22de3032e6a1
        //https://search.jd.com/Search?keyword=%E8%81%94%E6%83%B3%E7%94%B5%E8%84%91&enc=utf-8&wq=%E8%81%94%E6%83%B3%E7%94%B5%E8%84%91&pvid=9b6b9cc2737b49aa9d78eb9e83010af7
        List<String> urlList = new ArrayList<String>();
        //提取网页url
        String keyword ="联想电脑";
        String url =  "https://search.jd.com/Search?keyword="+keyword+"&enc=utf-8&wq="+keyword+"&pvid=9b6b9cc2737b49aa9d78eb9e83010af7";

        Document doc = Jsoup.connect(url).get();
                Elements eles = doc.select("#J_goodsList ul li");
        for (int i = 0; i < eles.size(); i++) {
            Element liElement = eles.get(i);
            Element aElement = liElement.selectFirst(".p-img a");
            urlList.add("http:"+aElement.attr("href"));
        }
        for (String url_ : urlList) {
            htmParse(url_);
        }
    }

    public static  void htmParse(String url) throws Exception{

        List<Map<String,String>> list = new ArrayList<Map<String,String>>();//key - 名称 value 就是值
        //1. 获得网页的document对象
        Document doc = Jsoup.connect(url).get();
        //        String strHtml =  doc.html();
        //        System.out.println(strHtml);
        //2. 解析网页
        //       Elements eles =  doc.select("#parameter-brand");
        //       Element element = eles.get(0);
        //        System.out.println(element.text());
        Elements eles = doc.select("ul.parameter2.p-parameter-list li");
        for (int i = 0; i <eles.size() ; i++) {
            Element element = eles.get(i);
            String context = element.html();
            String[] str = context.split("：");
            Map<String,String> map = new HashMap<String, String>();
            map.put(str[0],str[1]);
            list.add(map);
        }
        System.out.println(list);
    }
}*/
