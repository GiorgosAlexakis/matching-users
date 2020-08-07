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
    public static void sort(List<Integer> list) {
        if (list.size() < 2) {
            return;
        }
        int mid = list.size()/2;
        List<Integer> left = new ArrayList<Integer>(list.subList(0, mid));
        List<Integer> right = new ArrayList<Integer>(mid, list.size()));

        sort(left);
        sort(right);
        merge(left, right, list);
    }
    private static void merge(
            List<Integer> left, List<Integer> right, List<Integer> list) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                list.set(listIndex++, left.get(leftIndex++));
            } else {
                list.set(listIndex++, right.get(rightIndex++));
            }
        }
        while (leftIndex < left.size()) {
            list.set(listIndex++, left.get(leftIndex++));
        }
        while (rightIndex < right.size()) {
            list.set(listIndex++, right.get(rightIndex++));
        }
    }



    static int[] matching(userid){
        int age = //get age of user from database
                List<String> languages = //get user languages -> do not recommend users that dont speak the same language
                        List<String> interest = //get interests of a user
                                List<Integer> ids = new ArrayList<Integer>();
        List<Integer> weights = new ArrayList<Integer>();
        List<Integer> negative = //read negative list
        //weights for each same language add 1
        //activities ->we consider this the first 3 interests are the mains and for each same we add 10, for the next interests we add 2.
        int no_of_users = //get the totall number of users
                List<Integer> userids // get all user ids
        for(int i =0;i<no_of_users;i++){
            int tempdid = userids.get(i)
            boolean flag = negative.conatins(tempdid);
            if (i==userid || flag){
                continue;
            }
            ids.add(tempdid);
            List<String> temp_languages =
                    List<String> temp_interest =
                            temp_languages.retainAll(languages);
            int temp_weight = temp_languages.size();
            if(temp_weight == 0){
                continue;
            }
            if(interest.size()>=3){
                List<String> main_interest = new ArrayList<String>();
                for(int j = 0; j<3;j++){
                    main_interest.add(interest.get(j));
                }
                List<String> second = new ArrayList<String>();
                for(int j = 3; j<interest.size();j++){
                    second_interest.add(interest.get(j));
                }
                main_interest.retainAll(temp_interest);
                second_interest.retainAll(temp_interest);
                temp_weight += main_interest.size()*10 + second_interest.size()*2;

            }
            else{
                temp_interest.retainAll(interest);
                temp_weight += temp_interest.size()*10;
            }
            int temp_age = //get age of user -> weight = 3/ age_diference
                    temp_weight += 3/Math.abs(age - temp_age);
            weights.add(temp_weight);

            //merge weigths and change ids in the same way

            if(ids.size >=10){
                weights.remove(10);
                ids.remove(10);
            }
        }
        int result[ids.size()];
        for (int i =0; i<ids.size();i++){
            result[i] = ids.get(i);
        }
        return result;

    }
    }
    }


}
*/