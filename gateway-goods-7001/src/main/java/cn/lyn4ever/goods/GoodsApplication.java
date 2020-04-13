package cn.lyn4ever.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 微信公众号 “小鱼与Java”
 *
 * @date 2020/4/13
 * @auther Lyn4ever
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class,args);
    }
}
