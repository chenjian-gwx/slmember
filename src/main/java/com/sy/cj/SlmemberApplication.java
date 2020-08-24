package com.sy.cj;

import com.sy.cj.common.config.CasConfig;
import com.sy.cj.common.config.SpringShiroConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Import(value = {SpringShiroConfig.class, CasConfig.class})
@EnableJpaRepositories(basePackages = {"com.sy.cj.mapper"})
//持久化类扫描
@EntityScan(basePackages = {"com.sy.cj.model"})
public class SlmemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlmemberApplication.class, args);
    }

}
