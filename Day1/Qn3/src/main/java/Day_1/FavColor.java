package Day_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FavColor {
	
	@GetMapping("/color")
	public String postController(@RequestBody String favcolor) {
	 
	    return "My Fav Color is "+favcolor;
   
    }  
	
}
