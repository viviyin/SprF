package lab7.ex2;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.jms.core.JmsTemplate;

public class TestClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context ctx;
		try {
			ctx = new InitialContext();
			ConnectionFactory cfactory = (ConnectionFactory) ctx.lookup("jms/topicConnectionFactory");
			Destination myTopic = (Destination) ctx.lookup("jms/MyTopic");
			Destination myTopic2 = (Destination) ctx.lookup("jms/MyTopic2");
			JmsTemplate jmst = new JmsTemplate(cfactory);
			jmst.convertAndSend(myTopic, "Hi Spring!");
			jmst.convertAndSend(myTopic2, "Hi Java EE!");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Goog Job!!!");
		
	}

}
