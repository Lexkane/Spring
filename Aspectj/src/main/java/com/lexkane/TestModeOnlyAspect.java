package com.lexkane;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 */
@Aspect
public class TestModeOnlyAspect {
	@Pointcut("execution(@com.lexkane.TestModeOnly * *(..))")
	public void testModeOnlyMethods() {
	}

	@Before("testModeOnlyMethods()")
	public void testModeOnly(JoinPoint joinPoint) {
		if (!Boolean.getBoolean("test.mode.enabled")) {
			throw new TestModeOnlyException(joinPoint.toString());
		}
	}
}
