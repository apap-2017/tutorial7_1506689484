package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.dao.CourseDAO;
import com.example.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class CourseServiceRest {

	@Autowired
	private CourseDAO courseDAO;
	
	public CourseModel getCourse(String id) {
		log.info("REST - select course with id {}", id);
		return courseDAO.getCourse(id);
	}
}
