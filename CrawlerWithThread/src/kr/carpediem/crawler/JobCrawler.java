package kr.carpediem.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JobCrawler implements Runnable {
	JobQueue q;
	int num;
	public JobCrawler() {
		System.out.println("Runn");
		q = JobQueue.createInstanceOfJobQueue();
	}

	@Override
	public void run() {
		while(true) {
			if(q.size() > 0) {
				Document doc;
				try {
					String url = "http://www.saramin.co.kr" + q.get();
					doc = Jsoup.connect(url).get();
					//System.out.println(url);
					Element date = doc.selectFirst(".date");
					System.out.println(date.text());
					num++;
					System.out.println(num + url);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else {
				System.out.println("exit");
				break;
			}
		}
	}
	
}
