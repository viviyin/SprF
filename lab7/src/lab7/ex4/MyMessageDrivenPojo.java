package lab7.ex4;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageDrivenPojo implements MessageListener {

	@Override
	public void onMessage(Message msg) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Message Received: "+((TextMessage)msg).getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
