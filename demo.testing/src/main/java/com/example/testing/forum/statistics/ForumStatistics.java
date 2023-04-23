package com.example.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {

    private int numberOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComments = 0;

    private double averagePostsPerUser = 0;
    private double averageCommentsPerUser = 0;
    private double averageCommentsPerPost = 0;

    public ForumStatistics() {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.averagePostsPerUser = averagePostsPerUser;
        this.averageCommentsPerUser = averageCommentsPerUser;
        this.averageCommentsPerPost = averageCommentsPerPost;
    }

    public int getNumbersOfUsers() {
        return numberOfUsers;
    }

    public int getNumbersOfPosts() {
        return numberOfPosts;
    }

    public int getNumbersOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averagePostsPerUser = numberOfPosts / numberOfUsers;
            averageCommentsPerUser = numberOfComments / numberOfUsers;
        }
        if (numberOfUsers < 0) {
            averageCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {

        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averagePostsPerUser);
        System.out.println("Average number of comments per user: " + averageCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageCommentsPerPost);
    }

}
