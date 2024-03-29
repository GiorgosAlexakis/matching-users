package matching.users.Repositories;

import matching.users.Models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CourseRepository extends CrudRepository<Course, Long> {
}