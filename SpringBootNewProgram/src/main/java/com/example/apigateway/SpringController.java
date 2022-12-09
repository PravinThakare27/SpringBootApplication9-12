package com.example.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
@GetMapping("/getwelcome")
public String Welcome() {
	return "Welcome BHailog";
}
@GetMapping("/bye")
public String Bye() {
	return "Bye Bhailog";
}
}
