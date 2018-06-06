package org.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application2 {

	

	    public static void main(String[] args) {
	        // 程序启动入口
	        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
	        SpringApplication.run(Application2.class,args);
	    }

	/*	@Override
		public void customize(ConfigurableEmbeddedServletContainer container) {
			// TODO Auto-generated method stub
			container.setPort(8090);
		}*/

}
