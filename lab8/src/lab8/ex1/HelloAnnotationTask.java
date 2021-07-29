package lab8.ex1;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloAnnotationTask {
	
	@Scheduled(cron="0/5 * * * * ?")
	public void hello(){
		System.out.println("Hello World from Annotated Schedule! at time: "
								+new Date());
	}
}
