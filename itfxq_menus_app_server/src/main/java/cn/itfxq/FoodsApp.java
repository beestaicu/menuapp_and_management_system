package cn.itfxq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: soulcoder码仔项目分享圈
 * @Decription:
 * @Date: Created on 2021/7/22 10:15
 * @Email: 2579692606@qq.com
 */
@SpringBootApplication
@MapperScan("cn.itfxq")
public class FoodsApp {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(FoodsApp.class);

        springApplication.run(FoodsApp.class,args);
    }
}
