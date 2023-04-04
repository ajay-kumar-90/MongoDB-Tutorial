package com.ajaycodes.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoClientConfiguration extends AbstractMongoClientConfiguration {

	@Value("${BLOG_DB_URI}")
	private String dbUri;

	@Value("${BLOG_DB}")
	private String dbName;

	@Override
	protected String getDatabaseName() {
		return dbName;
	}

	@Override
	public MongoClient mongoClient() {
		return MongoClients.create();
	}


}
