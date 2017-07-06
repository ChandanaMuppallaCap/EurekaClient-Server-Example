package cloudClientSubject.SubjectCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SubjectCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubjectCloudApplication.class, args);
	}
}
