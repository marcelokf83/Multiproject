package subProject00.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import subProject02.service.MyService;

@RestController
public class Controller {
	
	private MyService myService;
	
	@Autowired
	public Controller() {
		super();
		this.myService = new MyService();
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return myService.helloService("Hello World With Service subProject00");
	}

}
