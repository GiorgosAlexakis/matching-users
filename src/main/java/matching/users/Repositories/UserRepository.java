package matching.users.Repositories;

import matching.users.Models.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {


    User findOne(long id);

    User findbyUsername(String username);
}