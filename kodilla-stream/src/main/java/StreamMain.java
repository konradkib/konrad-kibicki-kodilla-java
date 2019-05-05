import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMapOfUsers = forum.getUsers().stream()
                .filter(sex -> sex.getSex() == 'M')
                .filter(age -> (LocalDate.now().getYear() - age.getDateOfBirth().getYear()) > 20)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUsers -> forumUsers));


        System.out.println("# elements: " + resultMapOfUsers.size());
        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}
