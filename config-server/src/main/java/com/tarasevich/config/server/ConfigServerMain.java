package com.tarasevich.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Nikolai Tarasevich
 * @since 22.11.2020
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigServerMain {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMain.class, args);
    }

}
