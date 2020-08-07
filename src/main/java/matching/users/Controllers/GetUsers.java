package matching.users.Controllers;

import com.github.javafaker.Faker;
import matching.users.Models.Course;
import matching.users.Models.User;
import matching.users.Repositories.CourseRepository;
import matching.users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(path="/Home")
public class GetUsers {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path="/Users") Iterable<User> RetrieveUsers(){
    return userRepository.findAll();
    }


}
