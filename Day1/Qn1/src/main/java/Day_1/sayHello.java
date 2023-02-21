package Day_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHello {
	
	@GetMapping("/sayHello")
	public String sayHEllo(){
		return "Hello";
	}
}
