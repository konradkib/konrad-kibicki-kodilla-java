package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int countUsers;
    private int countPosts;
    private int countComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public int getCountUsers() {
        return countUsers;
    }

    public int getCountPosts() {
        return countPosts;
    }

    public int getCountComments() {
        return countComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        countUsers = statistics.usersNames().size();
        countPosts = statistics.postCount();
        countComments = statistics.commentCount();

        avgPostsPerUser = countPosts / (double)countUsers;
        avgCommentsPerUser = countComments / (double)countUsers;
        avgCommentsPerPost = countComments / (double)countPosts;
    }


}
