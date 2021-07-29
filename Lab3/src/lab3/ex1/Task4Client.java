package lab3.ex1;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task4Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lab3/ex1/beans-config.xml");
		// 請在下方寫作一段程式碼，取得pooledDataSource的實體，
		// 並印出任意屬性值，以測試資料庫是否連通。
		BasicDataSource ds = (BasicDataSource) context.getBean("pooledDataSource");
		System.out.println(ds.getMaxActive());

		try {
			Connection c1 = ds.getConnection();
			Connection c2 = ds.getConnection();
			Connection c3 = ds.getConnection();
			Connection c4 = ds.getConnection();
			Connection c5 = ds.getConnection();
			// 因為超過5，第6個會先block住，等到有連結被release為止
//			Connection c6 = ds.getConnection();
			System.out.println(ds.getMaxActive());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
