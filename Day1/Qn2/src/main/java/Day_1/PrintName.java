package Day_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintName {

	
	@GetMapping("/printName")
	@ResponseBody
	public String printName(@RequestParam("name") String name) {
		return "Welcome " + name;
	}
}
