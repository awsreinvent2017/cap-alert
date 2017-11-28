package com.fia.aws.reinvent.notification.service;

import com.fia.aws.reinvent.notification.model.HelloWorld;
import com.fia.aws.reinvent.notification.model.Message;

public interface SpringService {		
	public HelloWorld getQuickHello(String name);
	
	public String getCap(Message message);
	
}
