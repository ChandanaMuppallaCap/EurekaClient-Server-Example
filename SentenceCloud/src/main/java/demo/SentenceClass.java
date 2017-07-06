package demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class SentenceClass {
	 @Autowired
	 DiscoveryClient  dsclient;
	
	 @RequestMapping("/sentence")
	public @ResponseBody String getSentence() {
	    return 
	      getWord("SubjectCloud") + " "
	      + getWord("VerbCloud") + " "
	      + getWord("ArticleCloud") + " "
	      + getWord("AdjectiveCloud") + " "
	      + getWord("NounCloud") + "."
	      ;
	  }
	 public String getWord(String service) {
		    List<ServiceInstance> list = dsclient.getInstances(service);
		    if (list != null && list.size() > 0 ) {
		      URI uri = list.get(0).getUri();
		  if (uri !=null ) {
		    return (new RestTemplate()).getForObject(uri,String.class);
		  }
		    }
		    return null;
		  }

}
