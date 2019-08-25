package com.narayanatutorial.TwilioExamples;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSMSSend {

	// Find your Account Sid and Token at twilio.com/user/account by login your
	// username and password
	public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXX";
	public static final String AUTH_TOKEN = "XXXXXXXXXXXXXXXXXXXXX";

	static String fromPhoneNumber = "+121635XXXX";
	static String toPhoneNumber = "+919920XXXXXX";
	static String smsMessagebody = "Hi, Hello Friends.";

	public static void main(String[] args) {

		try {
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			Message message = Message
					.creator(new PhoneNumber(toPhoneNumber), new PhoneNumber(fromPhoneNumber), smsMessagebody).create();
			System.out.println("Message Id:"+message.getSid());
			System.out.println("Twilio Connection Established and SMS sent successfully");
		} catch (Exception e) {
			System.out.println("Twilio Connection not established, please check ACCOUNT_SID and AUTH_TOKEN, configure properly.");
			e.printStackTrace();
		}

	}

}
