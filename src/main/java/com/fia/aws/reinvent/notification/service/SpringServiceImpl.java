package com.fia.aws.reinvent.notification.service;

import org.apache.http.protocol.RequestContent;
import org.springframework.stereotype.Service;

import com.fia.aws.reinvent.notification.model.HelloWorld;
import com.fia.aws.reinvent.notification.model.Message;

@Service
public class SpringServiceImpl implements SpringService {
	
	public SpringServiceImpl() {
		// needed for instantiation
	}
	
	public String getCap(Message message) {
		
		System.out.println(message.getLabels().size());
		
		String xml	 = "<?xml version = \"1.0\" encoding = \"UTF-8\"?>\n" + 
				"<alert xmlns = \"urn:oasis:names:tc:emergency:cap:1.2\">\n" + 
				"  <identifier>43b080713727</identifier> \n" + 
				"  <sender>hsas@dhs.gov</sender> \n" + 
				"  <sent>"+java.time.LocalDate.now().toString()+"</sent>\n" + 
				"  <status>"+message.getStatus()+"</status> \n" + 
				"  <msgType>"+message.getLabels().get(0).getName()+"</msgType>\n" + 
				"  <scope>"+ message.getScope()+"</scope>  \n" + 
				"  <info>\n" + 
				"    <category>"+message.getCategory()+"</category>   \n" + 
				"    <event>" + message.getEvent()+ "</event>   \n" + 
				"    <urgency>"+message.getUrgency()+"</urgency>   \n" + 
				"    <severity>"+message.getSeverity()+"</severity>   \n" + 
				"    <certainty>"+message.getCertainty()+"</certainty>   \n" + 
				"    <senderName>U.S. Government, Department of Homeland Security</senderName>\n" + 
				"    <headline>Homeland Security Sets Code ORANGE</headline>\n" + 
				"    <description>The Department of Homeland Security has elevated the Homeland Security Advisory System threat level to ORANGE / High in response to intelligence which may indicate a heightened threat of terrorism.</description>\n" + 
				"    <instruction> A High Condition is declared when there is a high risk of terrorist attacks. In addition to the Protective Measures taken in the previous Threat Conditions, Federal departments and agencies should consider agency-specific Protective Measures in accordance with their existing plans.</instruction> \n" + 
				"    <web>http://www.dhs.gov/dhspublic/display?theme=29</web>\n" + 
				"    <parameter>\n" + 
				"      <valueName>HSAS</valueName>\n" + 
				"      <value>ORANGE</value>\n" + 
				"    </parameter>   \n" + 
				"    <resource>\n" + 
				"      <resourceDesc>Image file (GIF)</resourceDesc>\n" + 
				"      <mimeType>image/gif</mimeType>   \n" + 
				"      <uri>http://www.dhs.gov/dhspublic/getAdvisoryImage</uri>\n" + 
				"    </resource>   \n" + 
				"    <area>       \n" + 
				"      <areaLat>"+message.getGps().getLat()+"</areaLat>   \n" + 
				"      <areaLon>"+message.getGps().getLon()+"</areaLon>   \n" + 
				"    </area>\n" + 
				"  </info>\n" + 
				"</alert>";
		return xml;
	}
	
	@Override
	public HelloWorld getQuickHello(String name) {
		String quickHelloName = name;		
		if (name == null || name.isEmpty()) {
			quickHelloName = "world";
		}
		String message = "Hello " + quickHelloName + "!";
		HelloWorld hello = new HelloWorld(message);
		return hello;
	}
}