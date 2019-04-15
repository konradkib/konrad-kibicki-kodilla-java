package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {

    @Test
    public void testCaseUser(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assert.assertEquals("theForumUser", result);
    }

}
