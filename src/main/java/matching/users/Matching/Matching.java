/*
package matching.users.Matching;


Matching Fuction:
Input 1 user
Search in database for 10 best matches



for each user add a history table and a negative match table.
History table ->previus users that has been matched.
negative match -> users that the user said that didnt want to match.





*/
/*
import matching.users.Models.Course;
import matching.users.Models.User;

import matching.users.Repositories.CourseRepository;
import matching.users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

@Service
public class Matching{
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;
    public List<User> Matching(User user,long userid, String username, String userlanguage, List<Course> courses) {

        boolean hascourse=user.hasCourse("sigkekrimeno course san entity omws oxi san onoma");
        //merge sort
    public static void sort(List<Integer> list, List<User> list2) {
        if (list.size() < 2) {
            return;
        }
        int mid = list.size()/2;
        List<Integer> left = new ArrayList<Integer>(list.subList(0, mid));
        List<Integer> right = new ArrayList<Integer>(list.sublist(mid, list.size()));

        List<User> left2 = new ArrayList<Integer>(list2.sublist(0,mid));
        List<User> right2 = new ArrayList<Integer>(list2.sublist(mid,list2.size()));

        sort(left,left2);
        sort(right,right2);
        merge(left, right, list, left2, right2, list2);
    }
    private static void merge(
            List<Integer> left, List<Integer> right, List<Integer> list,List<User> left2, List<User> right2, List<User> list2 ) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        int left2Index = 0;
        int right2Index = 0;
        int list2Index = 0;


            while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                list.set(listIndex++, left.get(leftIndex++));
                list2.set(list2Index++, left2.get(left2Index++));
            } else {
                list.set(listIndex++, right.get(rightIndex++));
                list2.set(list2Index++, right2.get(right2Index++));
            }
        }
        while (leftIndex < left.size()) {
            list.set(listIndex++, left.get(leftIndex++));
            list2.set(list2Index++, left2.get(left2Index++));
        }
        while (rightIndex < right.size()) {
            list.set(listIndex++, right.get(rightIndex++));
            list2.set(list2Index++, right2.get(right2Index++));
        }
    }



    static User[] matching(User user){
        String user_language = user.getlanguage(); // the language of the user that wants to match
        List<Course> userCourses = convertToList(user.getCourses()); // the courses of the user that wants to match
        List<User> ids = convertToList(userRepository.findAll());
        List<Integer> weights = new ArrayList<Integer>();
        int no_of_users = ids.size();
        List<User> result_users = new ArrayList<User>();
        for(int i =0;i<no_of_users;i++){
            int tempdid = ids.get(i);
            int weight = 0;
            if (i==userid){
                continue;
            }
            ids.add(tempdid);
            String temp_language = tempdid.getlanguage();
            List<Course> temp_Courses = convertToList(tempid.getCourses());

            if(user_language != temp_language) {
                continue;
            }
            List<Course> same_courses = userCourses;
            same_courses.retainAll(temp_Courses);
            //score of course * 5
            for(int k = 0; k < same_courses.size();k++) {
                weight += same_courses.get(k).getCourse_rating() * 5;
            }
            weights.add(temp_weight);
            result_users.add(tempdid);

            //merge weigths and change ids in the same way
            sort(weights,result_users);

            if(ids.size >=20){
                weights.remove(20);
                result_users.remove(20);
            }
        }
        User result[result_users.size()];
        for (int i =0; i<result_users.size();i++){
            result[i] = result_users.get(i);
        }
        return result;

    }
    }
    }


}
*/