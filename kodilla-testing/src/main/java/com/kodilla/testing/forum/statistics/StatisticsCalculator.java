package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
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
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount >  0) {
            averagePostsPerUser = postsCount / usersCount;
        }
        if (usersCount > 0) {
            averageCommentsPerUser = commentsCount / usersCount;
        }
        if (postsCount > 0) {
            averageCommentsPerPost = commentsCount / postsCount;
        }
    }

    public void showStatistics() {
        System.out.println("Forum statistics are as follows:");
        System.out.println("Users Count = " + usersCount);
        System.out.println("Posts Count = " + postsCount);
        System.out.println("Comments Count = " + commentsCount);
        System.out.println("Average Posts per User = " + averagePostsPerUser);
        System.out.println("Average Comments per user = " + averageCommentsPerPost);
        System.out.println("Average Comments per post = " + averageCommentsPerPost);
    }

}
