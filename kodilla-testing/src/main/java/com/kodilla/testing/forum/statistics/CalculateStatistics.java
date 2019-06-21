package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    Statistics statistics;

    private int countUsers;
    private int countPosts;
    private int countComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public int getCountUsers() {
        return countUsers;
    }

    public int getCountPosts() {
        return countPosts;
    }

    public int getCountComments() {
        return countComments;
    }

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        countUsers = statistics.usersNames().size();
        countPosts = statistics.postCount();
        countComments = statistics.commentCount();

        avgPostsPerUser = (double)countPosts/countUsers;
        avgCommentsPerUser = (double)countComments/countUsers;
        avgCommentsPerPost = (double)countComments/countPosts;

    }













}
