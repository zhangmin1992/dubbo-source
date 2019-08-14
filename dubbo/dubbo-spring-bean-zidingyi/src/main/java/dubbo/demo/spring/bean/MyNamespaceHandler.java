package dubbo.demo.spring.bean;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {
	public void init() {
		registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
	}
}
