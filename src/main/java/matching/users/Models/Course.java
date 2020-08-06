package matching.users.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
public
class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long courseid;
    private String course_title;
    private String course_organization;
    private String course_rating;
    private String course_difficulty;
    private String course_students_enrolled;
    public Course(){}

    public long getCourseid() {
        return courseid;
    }
    public String getCourse_title(){
        return course_title;
    }
    public void setCourse_title(String course_title){
        this.course_title=course_title;
    }
    public String getCourse_organization(){
        return course_organization;
    }
    public void setCourse_organization(String course_organization){
        this.course_organization=course_organization;
    }
    public String getCourse_rating(){
        return course_rating;
    }
    public void setCourse_rating(String course_rating){
        this.course_rating=course_rating;
    }
    public String getCourse_difficulty(){return course_difficulty;}

    public void setCourse_difficulty(String course_difficulty) {
        this.course_difficulty = course_difficulty;
    }

    public  String getCourse_students_enrolled() {
        return course_students_enrolled;
    }

    public void setCourse_students_enrolled( String course_students_enrolled) {
        this.course_students_enrolled = course_students_enrolled;
    }

    @ManyToMany(mappedBy="courses")
    private Set<User> users;

    public Set<User> getUsers(){
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users=users;
    }
}
