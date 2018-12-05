package com.alankin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setup {
    @SuppressWarnings({"resource"})
    public static void main(String[] args) throws Exception {
        System.out.println("设置dubbo连接参数.");
        System.setProperty("dubbo.application.name", "center-user-local");
        System.setProperty("dubbo.consumer.timeout", "80000");
        System.setProperty("dubbo.consumer.retries", "0");
        System.setProperty("dubbo.registry.address", "zookeeper://192.168.235.130:2181?register=true");
        System.setProperty("dubbo.protocol.port", "20101");
        System.out.println("初始化spring容器");
        // 加载spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-provider.xml");
        context.start();
        System.out.println("启动成功");
        System.in.read();
    }
}
