package com.springboot.plus;

import com.springboot.plus.common.util.PrintApplicationInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * spring-boot-plus 项目启动入口
 *
 * @author geekidea
 * @since 2018-11-08
 */
@EnableAsync
@EnableScheduling
@EnableTransactionManagement
@EnableConfigurationProperties
@ServletComponentScan
@MapperScan({"com.springboot.plus.**.mapper", "com.example.**.mapper"})
@SpringBootApplication(scanBasePackages = {"com.springboot.plus", "com.example"})
public class SpringBootPlusApplication {
    public static void main(String[] args) {
        // 启动spring-boot-plus
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootPlusApplication.class, args);
        // 打印项目信息
        PrintApplicationInfo.print(context);
        // 打印项目提示
        PrintApplicationInfo.printTip(context);
    }
}
