package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//JPA with Hibernate
/*public interface ExerciseRepository {

	Exercise save (Exercise exercise);
	
}*/


//Spring Data JPA
@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {


}
