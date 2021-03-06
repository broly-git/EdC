package fr.itechsup.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.itechsup.entity.Task;

@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Integer> {

	List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
	List<Task> findByTaskStatus(@Param("status") String taskStatus);
	List<Task> findByTaskDateCreate(@Param("datecreate") Date taskDateCreate);
	List<Task> findByTaskDateArchived(@Param("datearchived") Date taskDateArchived);

}
