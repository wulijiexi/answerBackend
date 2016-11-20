package com.wulijiexi.answer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;

public class Dao extends JdbcDaoSupport{
	@Autowired
	public void autoWireDataSource(DataSource dataSource){
		this.setDataSource(dataSource);
	}
}
