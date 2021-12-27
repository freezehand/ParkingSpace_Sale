package Aop;

import Pojo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
@Aspect
public class LoginAop {
    @Pointcut("execution(* Service..*(..)) && !execution(* Service.UserServiceImpl.userlogin(..))&&!execution(* Service.UserServiceImpl.userregister(..))")
//   @Pointcut("execution(* Service.*.*(..))")
    private void verify(){}

    @Around("verify()")
    public  Object doverify(ProceedingJoinPoint joinPoint) throws Throwable{
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpSession session=request.getSession();
        Account user=(Account)session.getAttribute("account");
        if (user==null)
            return new ModelAndView("redirect:/login");
        return joinPoint.proceed();
    }
}
