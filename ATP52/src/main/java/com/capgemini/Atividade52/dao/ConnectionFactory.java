package com.capgemini.Atividade52.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	 private DataSource dataSource;
	

	    public ConnectionFactory(){
	        ComboPooledDataSource poolConex = new ComboPooledDataSource();
	        poolConex.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
	        poolConex.setUser("postgres");
	        poolConex.setPassword("123456");
	        poolConex.setMaxPoolSize(50);
	        this.dataSource = poolConex;
	    }

	    public Connection getConnection() throws SQLException{
	        return this.dataSource.getConnection();
	    }
	    
}
