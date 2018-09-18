package cn.edu.nyist.javastudy;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

//@Configuration
public class AppConfig {
	 public void addInterceptors(InterceptorRegistry registry){
	        //registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
	    }
}
