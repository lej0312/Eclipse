package com.day11;


import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JsoupTest {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://sports.daum.net").get();
			Elements ol = doc.select("ol.list_rank");
			Elements li = ol.select("li");
			for(int i=0; i<10; i++) {
				String txt = li.get(i).select("a").text();
				System.out.println(i +" : "+ txt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
