package Day_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ValueAnnotation {
	
	
	@Value("${unknown.param:default}")
	private String someDefault;

	@Value("HELLO!!!!")
	private String stringValue;
	
	@Value("${sample.value}")
	private String javaHome;
	
	
	@GetMapping("/")
	public String sayHello() {
		return stringValue +" "+javaHome +" "+ someDefault;
	}
	
	
}
