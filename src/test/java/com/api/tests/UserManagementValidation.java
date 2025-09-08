package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;

import groovy.lang.Newify;
import io.restassured.response.Response;

public class UserManagementValidation {
	
	AuthService authService = new AuthService();
	UserProfileManagementService userProfileManagementService=new UserProfileManagementService();
	Response response;
	String token = authService.getToken(new LoginRequest("jaaji1234", "jaaji1234"));
	
	public void changePasswordTest() {
		
	}
	@Test(description = "Verify if Get User Profile API is working ........")
	public void getUserProfileTest() {
		
		response=userProfileManagementService.getProfile(token);
		System.out.println(response.asPrettyString());
	}
	
	@Test(description = "Verify if Update User Profile API is working ........")
	public void updateFullUserProfileTest() {
		ProfileRequest profileRequest = new ProfileRequest.Builder()
				.firstName("Jaaji")
				.lastName("D")
				.mobileNumber("9876543210")
				.email("jaaji1234@testing.com")
				.build();
		response=userProfileManagementService.updateProfile(profileRequest, token);
		System.out.println(response.asPrettyString());
	}
	
	public void updatePartialUserProfileTest() {
		
	}
	
	public void deleteUserTest() {
		
	}

}
