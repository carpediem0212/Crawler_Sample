package kr.carpediem.crawler;

import java.util.LinkedList;
import java.util.Queue;

public class JobQueue {
	private static JobQueue jobQueue;

	Queue<String> urlQueue;

	private JobQueue() {
		urlQueue = new LinkedList<>();
	}

	public static JobQueue createInstanceOfJobQueue() {
		if (jobQueue == null) {
			jobQueue = new JobQueue();
		}

		return jobQueue;
	}

	public void add(String data) {
		urlQueue.add(data);
	}

	public String get() {
		return urlQueue.remove();
	}
	
	public int size() {
		return urlQueue.size();
	}
}
