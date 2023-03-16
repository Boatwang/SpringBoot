package com.guide; /**
 * @CreateTime 2023/3/15-15 10:40
 * @Author wangchunran
 * @Description
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
//        new SpringApplicationBuilder().bannerMode(Banner.Mode.OFF).run(args);
//        SpringApplication springApplication = new SpringApplication();
//        springApplication.setBannerMode(Banner.Mode.OFF);
        SpringApplication.run(MyApplication.class, args);

    }
}