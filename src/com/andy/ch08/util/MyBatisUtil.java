package com.andy.ch08.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyBatisUtil {
	private static final Logger logger = LoggerFactory.getLogger(MyBatisUtil.class);
	private final String MYBATIS_CONFIG = "mybatis/mybatis-config.xml";

	private static MyBatisUtil instance = new MyBatisUtil();

	public static MyBatisUtil getInstance() {
		return instance;
	}
	private SqlSessionFactory factory;

	private MyBatisUtil() {
		try (InputStream inputStream = Resources.getResourceAsStream(this.MYBATIS_CONFIG)){
			this.factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			logger.error("factory 생성 실패", e);
		}
	}

	public SqlSession getSession() {
		return this.factory.openSession();
	}

	public SqlSession getSession(boolean autoCommit) {
		return this.factory.openSession(autoCommit);
	}
}
