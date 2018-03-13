package kr.carpediem.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NewsCrawler {
	JobQueue q = JobQueue.createInstanceOfJobQueue();
	
	public NewsCrawler() {
		try {
			//해당 주소의 Html 문서를 크롤링 할때 Document 객체에 반환
			Document doc = Jsoup.connect("http://www.saramin.co.kr/zf_user/jobs/public/list/page/1?sort=ud&listType=public&public_list_flag=y#searchTitle").get();
			Elements cooperationName = doc.select(".notification_info .str_tit");
			
			//System.out.println(cooperationName.size());
			
			for(int i = 0; i < cooperationName.size(); i++) {
				Element e = cooperationName.get(i);
				q.add(e.attr("href") + "#" + i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
