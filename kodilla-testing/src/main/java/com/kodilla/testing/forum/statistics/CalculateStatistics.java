package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    Statistics statistics;

    private int countUsers;
    private int countPosts;
    private int countComments;


    public Statistics getStatistics() {
        return statistics;
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

        double avgPostsPerUser = countPosts/countUsers;
        double avgCommentsPerUser = countComments/countUsers;
        double avgCommentsPerPost = countComments/countPosts;

    }













}
