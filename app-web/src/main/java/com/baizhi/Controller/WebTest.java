package com.baizhi.Controller;

import com.baizhi.service.HelloService;

/**
 * Created by Administrator on 2018/7/1.
 */
public class WebTest {
    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        String qaq = helloService.sayHelloService("qaq");
        System.out.println(qaq);
    }


}
