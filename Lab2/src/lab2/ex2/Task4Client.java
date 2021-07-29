package lab2.ex2;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task4Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lab2/ex2/beans-config.xml");
		ProductCollection pc = (ProductCollection) context.getBean("pc");
		List<Product> list = pc.getList();
		for (Product product : list) {
			System.out.println(product);
		}
		System.out.println("---------------------");

		list.forEach(p -> System.out.println(p));
		System.out.println("---------------------");

		Map<String, Product> map = pc.getMap();
		if (map != null) {
			Set<String> keySet = map.keySet();
			for (String s : keySet) {
				System.out.println(map.get(s));
			}
		}
		System.out.println("---------------------");
		for (Map.Entry<String, Product> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "==>" + entry.getValue());
		}
		System.out.println("---------------------");
		map.forEach((k, v) -> System.out.println(k + "==>" + v));
	}

}
