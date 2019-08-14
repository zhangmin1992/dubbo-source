package dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.Container;

public class Provider {
	 
    public static void main(String[] args) throws Exception {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
    	context.start();
    	System.out.println("----------------服务已启动，按任意键结束···········--------------------");
        System.in.read();
    }
 
}


