package app.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
//http://192.168.1.100:28002/config-client/dev/master
public class CfgServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfgServiceApplication.class, args);
	}

}

