package com.in28minutes.learnspringframework.busineservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	MongoDbDataService mongoDb;
	
	MysqlDbDataService mysqlDb;
	
	@Autowired
	public BusinessCalculationService(MongoDbDataService mongoDb, MysqlDbDataService mysqlDb) {
		super();
		this.mongoDb = mongoDb;
		this.mysqlDb = mysqlDb;
	}
	
	public String toString() {
		return "Using " + this.mongoDb + " and " + this.mysqlDb;
	}
	
	public int findMax() {		
		return Arrays
				.stream(mongoDb.retrieveData())
				.max()
				.orElse(0);
	}
}
