package net.madvirus.spring4.ch01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		String configLocation ="classpath:applicationContext.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configLocation);
		Project project = ctx.getBean("Project",Project.class);
		project.build();
		ctx.close();
	}
}
