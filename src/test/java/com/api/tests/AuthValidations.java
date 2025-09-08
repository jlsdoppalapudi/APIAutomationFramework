package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class AuthValidations {

	AuthService authService = new AuthService();
	Response response;
	
	@Test(description = "Verify if Login API is working ........")
	public void loginTest() {
		response=authService.login(new LoginRequest("jaaji1234", "jaaji1234"));
		System.out.println(response.asPrettyString());
		System.out.println("**************************************************************");
	}
	
//	@Test(description = "Verify if Signup API is working ........")
	public void signupTest() {
		SignUpRequest signUpRequest=new SignUpRequest.Builder().userName("jaaji4321")
				.email("jaaji4321@testing.com")
				.password("jaaji4321")
				.firstName("Jaaji")
				.lastName("D")
				.mobileNumber("1234567891").build();
		response=authService.signup(signUpRequest);
		System.out.println(response.asPrettyString());
		System.out.println("**************************************************************");
	}
	
	@Test(description = "Verify if Forgot Password API is working ........")
	public void forgotPasswordTest() {
		response=authService.forgotPassword("jaaji4321@testing.com");
		System.out.println(response.asPrettyString());
		System.out.println("**************************************************************");
	}
	
	public void resetPasswordTest() {
		
	}
	
}
