package matching.users.Models;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class User {

    private Long id;
    public String username;
    private String language;
    private Set<Course> courses = new HashSet<Course>(0);

    public User() {
    }

    public User(String username, String language) {
        super();
        this.username = username;
        this.language = language;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getlanguage() {
        return language;
    }

    public void setlanguage(String language) {
        this.language = language;
    }

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_course", joinColumns = {@JoinColumn(name = "id")}, inverseJoinColumns = {@JoinColumn(name = "courseid")})
    @JsonManagedReference
    public Set<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public boolean hasCourse(Course course) {
        for (Course userCourse : getCourses()) {
            if (userCourse.getCourseid() == course.getCourseid()) {
                return true;
            }
        }
        return false;

    }
}