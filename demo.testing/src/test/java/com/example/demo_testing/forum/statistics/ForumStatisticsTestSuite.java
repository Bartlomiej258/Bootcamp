package com.example.demo_testing.forum.statistics;

import com.example.testing.forum.statistics.ForumStatistics;
import com.example.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    List<String> generateForumUsers(int usersQuantity) {
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < usersQuantity; i++) {
            users.add("Adam");
        }
        return users;
    }

    @Test
    void testCalculateStatisticsNumberOfPost0() {
        //Given
        Statistics statistics = statisticsMock;
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        forumStatistics.showStatistics();

        //Then
        Assertions.assertEquals(0, forumStatistics.getNumbersOfUsers());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfPosts());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfComments());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsNumberOfPost1000() {
        //Given
        Statistics statistics = statisticsMock;
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateForumUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assertions.assertEquals(10, forumStatistics.getNumbersOfUsers());
        Assertions.assertEquals(1000, forumStatistics.getNumbersOfPosts());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfComments());
        Assertions.assertEquals(100, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsNumberOfComment0() {
        //Given
        Statistics statistics = statisticsMock;
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateForumUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assertions.assertEquals(10, forumStatistics.getNumbersOfUsers());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfPosts());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfComments());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWhenCommentsAreLessThenPosts() {
        //Given
        Statistics statistics = statisticsMock;
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateForumUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assertions.assertEquals(10, forumStatistics.getNumbersOfUsers());
        Assertions.assertEquals(10, forumStatistics.getNumbersOfPosts());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfComments());
        Assertions.assertEquals(1, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWhenCommentIsGreaterThenPosts() {
        //Given
        Statistics statistics = statisticsMock;
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateForumUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assertions.assertEquals(10, forumStatistics.getNumbersOfUsers());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfPosts());
        Assertions.assertEquals(10, forumStatistics.getNumbersOfComments());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(1, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWhenUsersIsEqual0() {
        //Given
        Statistics statistics = statisticsMock;
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateForumUsers(0);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assertions.assertEquals(0, forumStatistics.getNumbersOfUsers());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfPosts());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfComments());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWhenUsersIsEqual100() {
        //Given
        Statistics statistics = statisticsMock;
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateForumUsers(100);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assertions.assertEquals(100, forumStatistics.getNumbersOfUsers());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfPosts());
        Assertions.assertEquals(0, forumStatistics.getNumbersOfComments());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }


}
