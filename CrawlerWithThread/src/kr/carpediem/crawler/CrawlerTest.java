package kr.carpediem.crawler;

public class CrawlerTest {
	public static void main(String[] args) {
		NewsCrawler n = new NewsCrawler();
		Thread t1 = new Thread(new JobCrawler());
		Thread t2 = new Thread(new JobCrawler());
		Thread t3 = new Thread(new JobCrawler());
		Thread t4 = new Thread(new JobCrawler());
		Thread t5 = new Thread(new JobCrawler());
		Thread t6 = new Thread(new JobCrawler());
		Thread t7 = new Thread(new JobCrawler());
		Thread t8 = new Thread(new JobCrawler());
		Thread t9 = new Thread(new JobCrawler());
		Thread t10 = new Thread(new JobCrawler());
		long start = System.currentTimeMillis();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}
}
