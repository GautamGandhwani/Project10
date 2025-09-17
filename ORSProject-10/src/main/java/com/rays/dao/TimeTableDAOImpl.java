package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.CourseDTO;
import com.rays.dto.SubjectDTO;
import com.rays.dto.TimeTableDTO;

@Repository
public class TimeTableDAOImpl extends BaseDAOImpl<TimeTableDTO> implements TimeTableDAOInt {

	@Autowired
	SubjectDAOInt subjectDao;

	@Autowired
	CourseDAOInt courseDao;

	@Override
	protected void populate(TimeTableDTO dto, UserContext userContext) {

		SubjectDTO subjectDto = subjectDao.findByPK(dto.getSubjectId(), userContext);
		if (subjectDto != null) {
			dto.setSubjectName(subjectDto.getName());
		}
		CourseDTO courseDto = courseDao.findByPK(dto.getCourseId(), userContext);
		if (courseDto != null) {
			dto.setCourseName(courseDto.getName());
		}
	}

	public Class<TimeTableDTO> getDTOClass() {
		return TimeTableDTO.class;
	}

	protected List<Predicate> getWhereClause(TimeTableDTO dto, CriteriaBuilder builder, Root<TimeTableDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSubjectName())) {

			whereCondition.add(builder.like(qRoot.get("subjectName"), dto.getSubjectName() + "%"));
		}
		if (!isEmptyString(dto.getCourseName())) {

			whereCondition.add(builder.like(qRoot.get("courseName"), dto.getCourseName() + "%"));
		}
		return whereCondition;
	}
}