package day26.JSoul;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * 1)	需求：获取 id="messages"元素并输出元素名称
 * 2)	需求：获取 index.html 中所有元素含有 class 属性值为 price 并打印输出元素体内容
 * 3)	需求：获取 index.html 中img含有属性 src 所有元素,并打印输出元素名称和元素体数据
 * 4)	需求：获取 index.html 中div下strong元素
 * 5)	获取 index.html 中 img 中src ="images/jiangxuan_2.jpg"元素后面同级第一个兄弟 div 元素并打印元素数据
 */
public class Train3 {
    public static void main(String[] args) throws IOException {
        //得到File对象
        File file = new File("index.html");
        //得到文档对象
        Document document = Jsoup.parse(file, "utf-8");

        Elements elements;

        Element e;

        e = document.getElementById("messages");
        System.out.println(e.id());

        System.out.println("=================================");

        elements = document.getElementsByClass("price");
        for (Element ee : elements) {
            System.out.println(ee.text());
            System.out.println("=================================");

        }

        Elements divStrong = document.select("div strong");
        System.out.println(divStrong);
        System.out.println("----------------------------------------");

    }
}
