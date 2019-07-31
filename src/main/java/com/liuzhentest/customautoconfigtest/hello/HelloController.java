package com.liuzhentest.customautoconfigtest.hello;

import com.liuzhen.customautoconfig.autoconfig.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试自定义的自动配置类
 * @Author LZ
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return helloService.sayHello();
    }
}
