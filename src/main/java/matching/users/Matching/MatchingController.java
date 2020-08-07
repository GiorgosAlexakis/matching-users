package matching.users.Matching;

import matching.users.Models.Course;
import matching.users.Models.User;
import matching.users.Repositories.CourseRepository;
import matching.users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import matching.users.Matching.Matching;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(path="/Home/Users/")

public class MatchingController{
        @Autowired
        private CourseRepository CourseRepository;
        @Autowired
        private UserRepository UserRepository;
        @RequestMapping(path="/{username}/Match") List<User> GetSimilarUsers(@PathVariable("username") String username){
            User user=UserRepository.findbyUsername(username);
            long userid=user.getId();
            String userlanguage=user.getlanguage();
            List<Course> courses = convertToList(user.getCourses());
            Matching match;
            match = new Matching();
            List<User> similarusers=match.Matching(userid,username,userlanguage,courses);
            return similarusers;
        }
        public static <T> List<T> convertToList(Set<T> set)
        {
            return new ArrayList<>(set);
        }
}
