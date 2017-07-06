package cloudClientnoun.NounCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NounCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(NounCloudApplication.class, args);
	}
}
