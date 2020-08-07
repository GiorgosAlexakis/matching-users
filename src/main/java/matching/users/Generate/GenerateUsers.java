
package matching.users.Generate;

import com.github.javafaker.Faker;
import matching.users.Models.Course;
import org.springframework.ui.Model;
import matching.users.Models.User;
import matching.users.Repositories.CourseRepository;
import matching.users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(path="/App")
public class GenerateUsers {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CourseRepository courserepo;
    @RequestMapping(path="/Generate")
    public  @ResponseBody String GenerateUser(){
        Faker faker = new Faker();
        Iterable<Course> course =courserepo.findAll();
        List<Course> target = new ArrayList<>();
        course.forEach(target::add);
        for(int i=0;i<100;i++) {
            String username;
            username = faker.name().lastName();
            username= username+i+faker.number().numberBetween(1,10000);
            User n = new User();
            n.setUsername(username);
            n.setlanguage(faker.options().option("English","French","Spanish","German","Greek").toString());
            for(int j=0;j<20;j++) {
                n.getCourses().add(faker.options().nextElement(target));
            }
            userRepository.save(n);
        }
        return "Generated Users Successfully";
    }

}
