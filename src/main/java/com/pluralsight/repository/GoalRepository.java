package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//JPA with Hibernate
/*public interface GoalRepository {

	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();
	
}*/

@Repository("goalRepository")
public interface GoalRepository extends JpaRepository<Goal, Long> {

    @Query("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " +
            "from Goal g, Exercise e where g.id = e.goal.id")
    List<GoalReport> findAllGoalReports();
}
