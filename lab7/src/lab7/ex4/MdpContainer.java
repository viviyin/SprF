package lab7.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

public class MdpContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("lab7/ex4/beans-config.xml");
		DefaultMessageListenerContainer container = (DefaultMessageListenerContainer) context.getBean("mdpContainer");
		container.start();
	}

}
