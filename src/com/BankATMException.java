package com;

//	Bank Custom Exception Class extending Exception Class
public class BankATMException extends Exception{

	String errorMessage;					//	Variable to store and format error message
	
	BankATMException (String message){		//	Constructor of the Class and assigns the user sent message to class variable
		errorMessage = message;
	}
	
	public String toString(){				//	Method where Error message is formated
		return ("Error Message : " + errorMessage);
	}
}
