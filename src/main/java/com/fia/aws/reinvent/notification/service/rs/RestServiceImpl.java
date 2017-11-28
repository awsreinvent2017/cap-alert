package com.fia.aws.reinvent.notification.service.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fia.aws.reinvent.notification.model.HelloWorld;
import com.fia.aws.reinvent.notification.model.Message;
import com.fia.aws.reinvent.notification.service.SpringService;

@Controller
public class RestServiceImpl implements RestService {

	@Autowired
	private SpringService service;
	
	public RestServiceImpl() {
	}

	@Override
	public HelloWorld getQuickHello(String name) {
		return service.getQuickHello(name);
	}

	@Override
	public String getCap(Message message) {
		return service.getCap(message);
	}
}