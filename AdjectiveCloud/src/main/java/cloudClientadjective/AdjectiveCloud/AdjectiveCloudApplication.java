package cloudClientadjective.AdjectiveCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdjectiveCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdjectiveCloudApplication.class, args);
	}
}
