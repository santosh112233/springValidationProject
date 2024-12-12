package com.validate.entities;



import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;



public class LoginData {
	
	@jakarta.validation.constraints.NotBlank(message = "Username can't be empty")
	@Size(min = 5, max = 12, message = "Username must be between 5-12 characters")
	private String userName;
	
	@Email(regexp = "^([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)$", message = "Invalid Email")
	private String email;
	
	@AssertTrue(message = "Must agree terms and condition")
	private boolean agreed;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	
	

}
