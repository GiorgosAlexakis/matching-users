package matching.users.Matching;

import matching.users.Models.Course;
import matching.users.Models.User;
import matching.users.Repositories.CourseRepository;
import matching.users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import matching.users.Matching.Matching;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
@CrossOrigin
@RequestMapping(path="/Home")
public class MatchingController{
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path="/Match/{username}")
    @ResponseBody List<User> GetSimilarUsers(@PathVariable("username") String username){
        User user=userRepository.findByUsername(username);
        List<User> ids = convertToListUser(userRepository.findAll());
        long userid=user.getId();
        String userlanguage=user.getlanguage();
        List<Course> courses = convertToList(user.getCourses());
        Matching match;
        match = new Matching();
        List<User> similarusers=match.matching(user,userid,username,userlanguage,courses, ids);
        List<User> testt = new ArrayList<User>();
        testt.add(user);
        return similarusers;
    }
    public static <T> List<T> convertToList(Set<T> set)
    {
        return new ArrayList<>(set);
    }
    public static  List<User> convertToListUser(Iterable<User> iterator)
    {
        // Create an empty list
        List<User> list = new ArrayList<>();
        // Add each element of iterator to the List
        for (User usr : iterator){
            list.add(usr);
        }
        // Return the List
        return list;
    }
}