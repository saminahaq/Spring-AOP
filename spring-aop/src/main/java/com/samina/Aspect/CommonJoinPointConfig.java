package com.samina.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.samina.Data.*.*(..))")
	public void dataLayerExecution(){}
	
	@Pointcut("execution(* com.samina.Business.*.*(..))")
	public void businessLayerExecution(){}
	
	@Pointcut("dataLayerExecution() && businessLayerExecution()")
	public void allLayerExecution(){}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){}
	
	@Pointcut("within(com.samina.Data..*)")
	public void dataLayerExecutionWithWithin(){}

	@Pointcut("@annotation(com.samina.Aspect.TrackTime)")
	public void trackTimeAnnotation(){}

}
