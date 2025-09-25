package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class MyProfileForm {

	@NotEmpty(message = "First Name is required")
	private String firstName;

	@NotEmpty(message = "Last Name is required")
	private String lastName;

	@NotEmpty(message = "Login Id is required")
	private String loginId;

	@NotEmpty(message = "Gender is required")
	private String gender;

	@NotEmpty(message = "Mobile No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phone;

	@NotNull(message = "Date of birth is required")
	private Date dob;

	public String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String getLoginId() {
		return loginId;
	}

	void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	void setDob(Date dob) {
		this.dob = dob;
	}
}