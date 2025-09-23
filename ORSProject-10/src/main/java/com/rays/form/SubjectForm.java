package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubjectDTO;

public class SubjectForm extends BaseForm {

	@NotNull(message = "Course is required")
	@Min(1)
	private Long courseId = 0L;

	private String courseName;

	@NotEmpty(message = "Name is required")
	private String name;

	@NotEmpty(message = "Description is required")
	private String description;

	long getCourseId() {
		return courseId;
	}

	void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	String getCourseName() {
		return courseName;
	}

	void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	public BaseDTO getDto() {

		SubjectDTO dto = initDTO(new SubjectDTO());

		dto.setCourseId(courseId);
		dto.setCourseName(courseName);
		dto.setName(name);
		dto.setDescription(description);

		return dto;
	}
}
