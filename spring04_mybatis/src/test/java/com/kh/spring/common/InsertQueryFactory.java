package com.kh.spring.common;

import java.util.HashMap;
import java.util.Map;

public class InsertQueryFactory {

	private Map<String, Object> dataMap;
	
	public InsertQueryFactory(InsertQueryFactoryBuilder builder) {
		this.dataMap = builder.dataMap;
		this.dataMap.put("sec", builder.secMap);
		this.dataMap.put("data", builder.data);
		this.dataMap.put("hasSec", builder.hasSec);
	}
	
	public static InsertQueryFactoryBuilder builder() {
		return new InsertQueryFactoryBuilder();
	}
	
	public static class InsertQueryFactoryBuilder{
		
		private boolean hasSec = false;
		private Map<String, Object> dataMap = new HashMap<String, Object>();
		private Map<String, String> secMap = new HashMap<String, String>();
		private Map<String, String> data = new HashMap<String, String>();
		
		public InsertQueryFactoryBuilder setTableName(String tableName) {
			dataMap.put("table", tableName);
			return this;
		}
		
		public InsertQueryFactoryBuilder setColumn(String column, String value) {
			data.put(column, value);
			return this;
		}
		
		public InsertQueryFactoryBuilder setSequence(String column, String sequence) {
			hasSec = true;
			secMap.put(column, sequence);
			return this;
		}
		
		public InsertQueryFactory build() {
			return new InsertQueryFactory(this);
		}
		
	}
}
