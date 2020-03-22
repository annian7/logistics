package ren.annian.logistics.Aop;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.ClassClassPath;
import org.apache.ibatis.javassist.ClassPool;
import org.apache.ibatis.javassist.CtClass;
import org.apache.ibatis.javassist.CtMethod;
import org.apache.ibatis.javassist.bytecode.CodeAttribute;
import org.apache.ibatis.javassist.bytecode.LocalVariableAttribute;
import org.apache.ibatis.javassist.bytecode.MethodInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@Aspect
public class LogAdvice {

    @Pointcut("execution(* ren.annian.logistics.controller.*Controller.*(..))")
    public void myPointcut(){}

    @Around(value = "myPointcut()")
    public Object demoAop(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        log.debug("执行前：");
        Map<String, Object> params = getNameAndValue(proceedingJoinPoint);
        String methodName = proceedingJoinPoint.getSignature().getName();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            log.info("方法名"+methodName+" 参数：name: " + entry.getKey() + " value: " + entry.getValue());
        }
        Object object = proceedingJoinPoint.proceed();  //执行连接点方法，object：方法返回值
        log.debug("执行后：");
        log.info("返回"+object);
        return object;
    }

    /**
     * 获取参数Map集合
     * @param joinPoint
     * @return
     */
    Map<String, Object> getNameAndValue(ProceedingJoinPoint joinPoint) {
        Map<String, Object> param = new HashMap<>();

        Object[] paramValues = joinPoint.getArgs();
        String[] paramNames = ((CodeSignature)joinPoint.getSignature()).getParameterNames();

        for (int i = 0; i < paramNames.length; i++) {
            param.put(paramNames[i], paramValues[i]);
        }

        return param;
    }
}
