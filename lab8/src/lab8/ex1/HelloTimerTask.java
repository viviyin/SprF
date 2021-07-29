package lab8.ex1;

import java.util.Date;
import java.util.TimerTask;

public class HelloTimerTask extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World! at time: "+new Date());
	}

}
