package com.curtisnewbie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author zhuangyongj
 */
@EnableAsync
@SpringBootApplication
public class WebsiteSaverApplication {

    private static final Logger logger = LoggerFactory.getLogger(WebsiteSaverApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebsiteSaverApplication.class, args);
        logger.info(">>> Website Saver Application Running...");
    }

}
