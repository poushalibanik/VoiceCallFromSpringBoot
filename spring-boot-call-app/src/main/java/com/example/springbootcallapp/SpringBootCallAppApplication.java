package com.example.springbootcallapp;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;

@SpringBootApplication
public class SpringBootCallAppApplication implements ApplicationRunner {
	private final static String SID_ACCOUNT = "Your Twilio SID";
	private final static String AUTH_ID = "Twilio Auth ID";
	private final static String FROM_NUMBER="Twilio Mobile number";
	private final static String TO_NUMBER =" Mobile number To whom you want make a voice call";

	static{
		Twilio.init(SID_ACCOUNT, AUTH_ID);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCallAppApplication.class, args);
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
				new URI("http://demo.twilio.com/docs/voice.xml")).create();
	}
}
