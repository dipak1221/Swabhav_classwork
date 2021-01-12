package com.techlab.service;

public class DataService {
	
	private static DataService bucket;
	
	private DataService() {
		System.out.println(" service created");
	}
	
	public static DataService getInstance() {
		if(bucket==null)
			bucket=new DataService();
	
	return bucket;
	}
	
	public void processData() {
		System.out.println("data being processed "+this.hashCode());
	}
}
