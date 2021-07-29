package lab3.ex1;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task4Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lab3/ex1/beans-config.xml");
		// �Цb�U��g�@�@�q�{���X�A���opooledDataSource������A
		// �æL�X���N�ݩʭȡA�H���ո�Ʈw�O�_�s�q�C
		BasicDataSource ds = (BasicDataSource) context.getBean("pooledDataSource");
		System.out.println(ds.getMaxActive());

		try {
			Connection c1 = ds.getConnection();
			Connection c2 = ds.getConnection();
			Connection c3 = ds.getConnection();
			Connection c4 = ds.getConnection();
			Connection c5 = ds.getConnection();
			// �]���W�L5�A��6�ӷ|��block��A���즳�s���Qrelease����
//			Connection c6 = ds.getConnection();
			System.out.println(ds.getMaxActive());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
