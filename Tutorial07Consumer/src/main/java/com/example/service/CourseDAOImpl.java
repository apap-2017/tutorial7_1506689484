package com.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.CourseDAO;
import com.example.model.CourseModel;

@Service
public class CourseDAOImpl implements CourseDAO {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Override
	public CourseModel getCourse(String id) {
		CourseModel course = restTemplate().getForObject("http://localhost:8080/rest/course/view/"+id, CourseModel.class);
		return course;
	}
}
