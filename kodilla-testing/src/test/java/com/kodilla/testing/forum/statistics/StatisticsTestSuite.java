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
    public void after() {
        System.out.println("SUT Unit test completed.");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("SUT Class Suit test commencing.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("SUT Class Suit test completed");
    }

    @Test
    public void testZeroPosts() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("Forum user no " + i);
        }
        int postsNumber = 0;
        int commentsNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int noOfPosts = statisticsCalculator.getPostsCount();

        //Then
        Assert.assertEquals(0, noOfPosts);
    }

    @Test
    public void testThousandPosts() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("Forum user no " + i);
        }
        int postsNumber = 1000;
        int commentsNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int noOfPosts = statisticsCalculator.getPostsCount();

        //Then
        Assert.assertEquals(1000, noOfPosts);
    }

    @Test
    public void testZeroComments() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("Forum user no " + i);
        }
        int postsNumber = 1000;
        int commentsNumber = 0;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int noOfComments = statisticsCalculator.getCommentsCount();

        //Then
        Assert.assertEquals(0, noOfComments);
    }

    @Test
    public void testLessCommentsThanPosts() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("Forum user no " + i);
        }
        int postsNumber = 20;
        int commentsNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        boolean lessPostsThanComments = statisticsCalculator.getPostsCount() > statisticsCalculator.getCommentsCount();
        //Then
        Assert.assertTrue("true", lessPostsThanComments);
    }

    @Test
    public void testMoreCommentsThanPosts() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("Forum user no " + i);
        }
        int postsNumber = 10;
        int commentsNumber = 20;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        boolean moreCommentsThanPosts = statisticsCalculator.getPostsCount() < statisticsCalculator.getCommentsCount();
        //Then
        Assert.assertTrue("true", moreCommentsThanPosts);
    }

    @Test
    public void testUsersCountZero() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<>();

        int postsNumber = 10;
        int commentsNumber = 20;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCalculator.getUsersCount();
        //Then
        Assert.assertEquals(0, usersCount);
    }

    @Test
    public void testUsersCountOneHundert() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User no: " + i);
        }

        int postsNumber = 10;
        int commentsNumber = 20;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCalculator.getUsersCount();
        //Then
        Assert.assertEquals(100, usersCount);
    }
}