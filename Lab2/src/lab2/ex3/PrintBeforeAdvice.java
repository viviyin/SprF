package lab2.ex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PrintBeforeAdvice {

//	@Before("execution(* lab2.ex3.Product.*(..))")
//	public void before(JoinPoint jointPoint) {
//		System.out.println("這是PrintBeforeAdvice所加入的訊息：" + 
//				jointPoint.getSignature().getDeclaringTypeName() + "." + 
//				jointPoint.getSignature().getName());
//	}
	
	@Around("execution(* lab2.ex3.Product.*(..))")
	public Object before(ProceedingJoinPoint jointPoint) {
		long start = System.nanoTime();
		System.out.println("這是PrintBeforeAdvice所加入的訊息：" + 
				jointPoint.getSignature().getDeclaringTypeName() + "." + 
				jointPoint.getSignature().getName());

		Object obj = null;
		try {
			obj = jointPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end = System.nanoTime();
		System.out.println("Total Process Time = " + (end - start));
		return obj;
	}
}
