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

	@NotEmpty(message = "Enroll No is required")
	private String enrolNo;

	@NotEmpty(message = "First Name is required")
	private String firstName;

	@NotEmpty(message = "Last Name is required")
	private String lastName;

	@NotNull(message = "Date of birth is required")
	private Date dob;

	@NotNull(message = "Phone No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNo;

	@NotEmpty(message = "Email ID is required")
	@Email
	private String email;

	@NotNull(message = "College Name is required")
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