package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.StudentDTO;

public class StudentForm extends BaseForm {

	@NotEmpty(message = "please enter enroll")
	private String enrolNo;

	@NotEmpty(message = "please enter firstname")
	private String firstName;

	@NotEmpty(message = "please enter lastname")
	private String lastName;

	@NotNull(message = "Date of birth is required")
	private Date dob;

	@NotNull(message = "please enter phone")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNo;

	@NotEmpty(message = "please enter email")
	@Email
	private String email;

	@NotNull(message = "please enter college")
	@Min(1)
	private Long collegeId;

	private String collegeName;

	String getEnrolNo() {
		return enrolNo;
	}

	void setEnrolNo(String enrolNo) {
		this.enrolNo = enrolNo;
	}

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	Date getDob() {
		return dob;
	}

	void setDob(Date dob) {
		this.dob = dob;
	}

	String getPhoneNo() {
		return phoneNo;
	}

	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	Long getCollegeId() {
		return collegeId;
	}

	void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	String getCollegeName() {
		return collegeName;
	}

	void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public BaseDTO getDto() {

		StudentDTO dto = initDTO(new StudentDTO());

		dto.setEnrolNo(enrolNo);
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setDob(dob);
		dto.setPhoneNo(phoneNo);
		dto.setEmail(email);
		dto.setCollegeId(collegeId);

		return dto;
	}
}