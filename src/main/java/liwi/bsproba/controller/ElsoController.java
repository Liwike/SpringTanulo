package liwi.bsproba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import liwi.bsproba.rutinok.IBinjeim;
import liwi.bsproba.service.HelloService;

@RestController
public class ElsoController {

	private HelloService helloService;
	@Autowired
	private IBinjeim iBinjeim;

	@Autowired
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	@GetMapping("/hello")
	public String getHello() {
		return "Huhu:" + helloService.getDate()+"\n 2*2="+iBinjeim.szorzo(2, 2);
	}
}
