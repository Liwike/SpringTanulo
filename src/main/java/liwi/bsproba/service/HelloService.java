package liwi.bsproba.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String getDate() {
		return new SimpleDateFormat("yyyy.mm.dd hh.MM.dd.S").format(new Date());
	}

}
