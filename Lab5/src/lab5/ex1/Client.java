package lab5.ex1;

import lab5.ex1.Product;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lab5/ex1/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
        // add your code here
		Product product1= productDao.getProduct(1);
		product1.setName("Hibernate");
		product1.setPrice(120);
		productDao.save(product1);
		
		List<Product> list = productDao.getProducts();
		list.forEach(p->System.out.println(p));
	}

}
