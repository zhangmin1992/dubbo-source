package dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dubbo.demo.DemoService;

public class Consumer {
	 
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy
 
        while (true) {
            try {
                Thread.sleep(1000);
                String hello = demoService.sayHello("world"); // call remote method
                System.out.println(hello); // get result
 
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
 
        }
 
    }
}

