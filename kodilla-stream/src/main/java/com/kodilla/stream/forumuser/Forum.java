package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> users = new ArrayList<>();

    public Forum(){
        users.add(new ForumUser(101,"Dylan Murphy",'M', 2000,12,14,15));
        users.add(new ForumUser(12,"Phoebe Pearson",'F', 1963,2,24,0));
        users.add(new ForumUser(15,"Morgan Walsh",'M', 1977,7,19,5));
        users.add(new ForumUser(19,"Aimee Murphy",'F', 1923,4,4,64));
        users.add(new ForumUser(1110,"Ryan Talley",'M', 1973,9,11,0));
        users.add(new ForumUser(734,"Madelynn Carson",'F', 1989,10,30,77));
        users.add(new ForumUser(734,"Giancarlo Guerrero",'M', 1933,1,14,99));
    }

    public List<ForumUser> getUsers(){
        return new ArrayList<>(users);
    }


}
