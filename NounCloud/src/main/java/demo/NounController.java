package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NounController {
	
	@Value("${words}")	
	String words;
	 public @ResponseBody String getWord() {
		    String[] wordArray = words.split(",");
		    int i = (int)Math.round(Math.random() * (wordArray.length - 1));
		    return wordArray[i];
	 }


}
