package in.rani.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg="Welcome to Ashok it ....!!!!!!!";
		System.out.println("hello");
		return msg;
	}
}
