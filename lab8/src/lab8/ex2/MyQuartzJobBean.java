package lab8.ex2;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyQuartzJobBean extends QuartzJobBean {
	
	private int myValue;
	private MyMessage myMessage;
	

	public int getMyValue() {
		return myValue;
	}


	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}


	public MyMessage getMyMessage() {
		return myMessage;
	}


	public void setMyMessage(MyMessage myMessage) {
		this.myMessage = myMessage;
	}


	@Override
	protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println(myMessage.getContent()+","+myValue);
	}

}
