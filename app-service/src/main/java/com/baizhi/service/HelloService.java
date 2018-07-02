package com.baizhi.service;

import com.baizhi.dao.HelloDao;

/**
 * Created by Administrator on 2018/7/1.
 */
public class HelloService {

    public String sayHelloService(String name){
        HelloDao helloDao = new HelloDao();
        return helloDao.sayHello(name);

    }
}
