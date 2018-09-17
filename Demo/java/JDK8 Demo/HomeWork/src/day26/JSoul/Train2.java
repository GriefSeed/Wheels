package day26.JSoul;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * 1)	需求：获取 index.html 中所有 span 标签的元素并打印输出
 * 2)	需求：获取 index.html 中所有 class 属性值为 jx_tit 并打印输出
 * 3)	需求：获取 index.html 中元素属性 id="carousel-example-generic"的一个元素并打印输出
 */
public class Train2 {
    public static void main(String[] args) throws IOException {
        //得到File对象
        File file = new File("index.html");
        //得到文档对象
        Document document = Jsoup.parse(file, "utf-8");

        Elements elements;

        elements = document.getElementsByTag("span");
        for(Element e : elements){
            System.out.println(e.text());
        }

        System.out.println("===========");

        elements = document.getElementsByClass("jx_tit");
        for(Element e : elements){
            System.out.println(e.text());
        }

        System.out.println("===========");

        Element e = document.getElementById("carousel-example-generic");


        System.out.println(e);
    }
}
