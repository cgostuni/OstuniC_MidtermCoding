package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.lang.Throwable;

public class PersonException extends Person{
	
	String Person;
	
	
	Date today = Calendar.getInstance().getTime();
	
	Person birthday = new Person(DOB){
		birthday.getDOB();
	}
	
	public void BirthDate() throws Exception{
		if (birthday > today)
				throw new Exception("Wrong Argument");
		}

	public void BirthdayTest(){
		try {
			BirthDate();
		}
		catch (birthday bday){
			System.out.println("Birthday is more than 100 years older than current date");
		}
	}
	
	//check phone number
	
	Person number = new Person(phone_number){
		number.getPhone();
	}
	
	// regex
	List phoneNumbers = new ArrayList();
	phoneNumbers.add("(123) 456 7890");

	//Invalid phone numbers
	phoneNumbers.add("12345678");
	phoneNumbers.add("12-12-111");
	phoneNumbers.add("1234567890");
	phoneNumbers.add("123-456-7890");
	phoneNumbers.add("123.456.7890");
	phoneNumbers.add("123 456 7890");

	String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";

	Pattern pattern = Pattern.compile(regex);

	for(String email : phoneNumbers)
	{
		Matcher matcher = pattern.matcher(email);
		System.out.println(email +" : "+ matcher.matches());
	}
	
}
