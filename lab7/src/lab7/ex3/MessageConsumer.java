package lab7.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class MessageConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("lab7/ex3/beans-config.xml");
		JmsTemplate jmst = (JmsTemplate) context.getBean("jmst");
		System.out.println(jmst.receiveAndConvert());
		System.out.println("Bye Bye!!");	
	}

}
