/*
package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

//JPA with Hibernate
@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Exercise save(Exercise exercise) {
		
		em.persist(exercise);
		
		em.flush();
		
		return exercise;
	}

}
*/
