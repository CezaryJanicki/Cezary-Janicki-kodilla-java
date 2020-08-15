package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Before
    public void before() {
        System.out.println("SUT Unit test commencing.");
    }

    @After
    public void after() { System.out.println("SUT Unit test completed.");}

    @BeforeClass
    public static void beforeClass() {
        System.out.println("SUT Class Suit test commencing.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("SUT Class Suit test completed");
    }

    public static List<String> userArray(int noOfUsers) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < noOfUsers; i++) {
            users.add("Forum user no " + i);
        }
        return users;
    }

    @Test
    public void testZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = userArray(10);
        int postsNumber = 0;
        int commentsNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int noOfPosts = statisticsCalculator.getPostsCount();
        double averagePostsPerUser = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, noOfPosts);
        Assert.assertEquals(0, averagePostsPerUser, 0.1);
        Assert.assertEquals(1, averageCommentsPerUser, 0.1);
        Assert.assertEquals(0, averageCommentsPerPost, 0.1);
        statisticsCalculator.showStatistics();
    }

    @Test
    public void testThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = userArray(10);
        int postsNumber = 1000;
        int commentsNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int noOfPosts = statisticsCalculator.getPostsCount();
        double averagePostsPerUser = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(1000, noOfPosts);
        Assert.assertEquals(100, averagePostsPerUser, 0.1);
        Assert.assertEquals(1, averageCommentsPerUser, 0.1);
        Assert.assertEquals(0.01, averageCommentsPerPost, 0.001);
        statisticsCalculator.showStatistics();
    }

    @Test
    public void testZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = userArray(10);
        int postsNumber = 1000;
        int commentsNumber = 0;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int noOfComments = statisticsCalculator.getCommentsCount();
        double averagePostsPerUser = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, noOfComments);
        Assert.assertEquals(100, averagePostsPerUser, 0.1);
        Assert.assertEquals(0, averageCommentsPerUser, 0.1);
        Assert.assertEquals(0, averageCommentsPerPost, 0.001);
        statisticsCalculator.showStatistics();
    }

    @Test
    public void testLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = userArray(10);
        int postsNumber = 20;
        int commentsNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        boolean lessPostsThanComments = statisticsCalculator.getPostsCount() > statisticsCalculator.getCommentsCount();
        double averagePostsPerUser = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertTrue("true", lessPostsThanComments);
        Assert.assertEquals(2, averagePostsPerUser, 0.1);
        Assert.assertEquals(1, averageCommentsPerUser, 0.1);
        Assert.assertEquals(0.5, averageCommentsPerPost, 0.001);
        statisticsCalculator.showStatistics();
    }

    @Test
    public void testMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = userArray(10);
        int postsNumber = 10;
        int commentsNumber = 20;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        boolean moreCommentsThanPosts = statisticsCalculator.getPostsCount() < statisticsCalculator.getCommentsCount();
        double averagePostsPerUser = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertTrue("true", moreCommentsThanPosts);
        Assert.assertEquals(1, averagePostsPerUser, 0.1);
        Assert.assertEquals(2, averageCommentsPerUser, 0.1);
        Assert.assertEquals(2, averageCommentsPerPost, 0.001);
        statisticsCalculator.showStatistics();
    }

    @Test
    public void testUsersCountZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        //List<String> users = new ArrayList<>();
        List<String> users = userArray(0);
        int postsNumber = 10;
        int commentsNumber = 20;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCalculator.getUsersCount();
        double averagePostsPerUser = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, usersCount);
        Assert.assertEquals(0, averagePostsPerUser, 0.1);
        Assert.assertEquals(0, averageCommentsPerUser, 0.1);
        Assert.assertEquals(2, averageCommentsPerPost, 0.001);
        statisticsCalculator.showStatistics();
    }

    @Test
    public void testUsersCountOneHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = userArray(100);
        int postsNumber = 10;
        int commentsNumber = 20;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCalculator.getUsersCount();
        double averagePostsPerUser = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(100, usersCount);
        Assert.assertEquals(0.1, averagePostsPerUser, 0.01);
        Assert.assertEquals(0.2, averageCommentsPerUser, 0.01);
        Assert.assertEquals(2, averageCommentsPerPost, 0.001);
        statisticsCalculator.showStatistics();
    }
}