package JFS.BookShopApp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogInfoClass {
	
	@Before(value="execution(public void displayMyBook())")
	public void beforelogmethod() {
	System.out.println("Log info:method is inside MyBook");
	System.out.println("Log info:method name is displayMyBook");
	System.out.println("Log info: No argument List");
	
	}
	
	@After ("execution(public void displayMyBook())")
	public void AfterdisplayMyBook() {
		System.out.println("Log info:After method is done");
		System.out.println("Log info:After operation inside");
		
		
	}
	
	@AfterReturning(value="execution(public Integer artistcount())",returning="artistCount")
	public void AfterReturningartistCount() {
		System.out.println("Log info:AfterReturningArtistCount needs to be added");
		System.out.println("artist value returned succesfully after executing the method");
		
	}
	
//	@Around ("execution(public Integer artistcount())")
//	public void AroundartistCount() {
//		System.out.println("Log info: artist Display Method is in progress");
//		//System.out.println("Log info:After operation inside");
//		
		
	//}
	
	//@Pointcut("execution(public void displayMyBook())")
	//@Pointcut("execution(* MyBook.*(..))")
//	public void selectOne() {
//		
//	}
//	@Around("selectOne()")
//	public void AroundSelectOnePointcut() {
//		System.out.println("Log info:.......");
//		
//	}
	
//	@After ("execution(public void displayMyBook())")
//	public void AfterdisplayMyBook() {
//		System.out.println("Log info:After method is done");
//		System.out.println("Log info:After operation inside");
//		
//		
//	}
	//@After("execution(* com.howtodoinjava.")
	
	
	@After(value="execution(public void displayMyBook())")
	public void logmethod1(JoinPoint jointPoint) {
		
		System.out.println("Log:"+jointPoint.getSignature().getName());
		System.out.println("Log: Method name is displayMyBook");
		System.out.println("Log: No arugment List");
     }

}
