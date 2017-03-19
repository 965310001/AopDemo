package com.example.administrator.aopdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SingleClickAspect {
    String value();
//    static int TIME_TAG = 5;
//    private static final String TAG = "SingleClickAspect";
//    public static final int MIN_CLICK_DELAY_TIME = 600;//间隔时间600ms
//
//    @Pointcut("execution(@com.example.administrator.myapplication * *(..))")//根据SingleClick注解找到方法切入点
//    public void methodAnnotated() {
//    }
//
//    @Around("methodAnnotated()")//在连接点进行方法替换
//    public void aroundJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
//        View view = null;
//        for (Object arg : joinPoint.getArgs())
//            if (arg instanceof View) view = (View) arg;
//        if (view != null) {
//            Object tag = view.getTag(TIME_TAG);
//            long lastClickTime = ((tag != null) ? (long) tag : 0);
////            LogUtils.showLog("SingleClickAspect", "lastClickTime:" + lastClickTime);
////            Log.d(TAG, "aroundJoinPoint: ");
//            Log.d(TAG, "aroundJoinPoint: "+lastClickTime);
//            long currentTime = Calendar.getInstance().getTimeInMillis();
//            if (currentTime - lastClickTime > MIN_CLICK_DELAY_TIME) {//过滤掉600毫秒内的连续点击
//                view.setTag(TIME_TAG, currentTime);
////                LogUtils.showLog("SingleClickAspect", "currentTime:" + currentTime);
//                Log.d(TAG, "aroundJoinPoint: ");
//                joinPoint.proceed();//执行原方法
//            }
//        }
//    }
}