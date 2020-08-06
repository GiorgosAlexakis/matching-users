package matching.users.Generate;

import com.github.javafaker.Faker;
import matching.users.Models.Course;
import matching.users.Models.User;
import matching.users.Repositories.CourseRepository;
import matching.users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(path="/App")
public class FillCourses {
    @Autowired
    private CourseRepository CourseRepository;

    @RequestMapping(path="/FillCourses")
    public  @ResponseBody String FillCourse()  {
        String line = "";
        String splitBy = ",";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:/courses_data.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Course n = new Course();
        while (true)   //returns a Boolean value
        {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] course_data = line.split(splitBy);    // use comma as separator

            n.setCourse_title(course_data[1]);
            n.setCourse_organization(course_data[2]);
            n.setCourse_rating(course_data[4]);
            n.setCourse_difficulty(course_data[5]);
            n.setCourse_students_enrolled(course_data[6]);

        }

        CourseRepository.save(n);
        return "Filled courses";
    }

}