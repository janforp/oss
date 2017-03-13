package com.janita.oss;

import com.janita.oss.configuration.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableConfigurationProperties({Config.class})
public class OssApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OssApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OssApplication.class);
	}
}