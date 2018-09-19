package cn.edu.nyist.javastudy.front.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 
 * @author 李雪强
 *		这是用来测试服务提供是否成功写的类，
 *	可以删除。
 *
 */
@Controller
public class Test {
	  @Value("${server.port}")
      private String port;
      @RequestMapping("/tologin")
      public String hw(@RequestParam(required=false) String name) {
             //return "你好"+name+"现在端口号是："+port;
    	  return "front/mytest";
      }
      @RequestMapping("/login")
      public String hw1(@RequestParam(required=false) String name) {
             //return "你好"+name+"现在端口号是："+port;
    	  return "front/test";
      }
}
