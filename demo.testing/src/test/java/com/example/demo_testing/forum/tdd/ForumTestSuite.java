package com.example.demo_testing.forum.tdd;

import com.example.testing.forum.ForumComment;
import com.example.testing.forum.ForumPost;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite \uD83D\uDE31")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTests() {
        testCounter++;
        System.out.println("Preparing to execute tests #" + testCounter);
    }

    @Test
    void testAddPost() {
        //Given
        ForumPost.ForumUser forumUser = new ForumPost.ForumUser("mrsmith", "John Smith");

        //When
        forumUser.addPost("Hello everyone, this is first contribution here!", "mrsmith");

        //Then
        Assertions.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    void testAddComment() {
        //Given
        ForumPost.ForumUser forumUser = new ForumPost.ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone!" +
                "this is my first contribution here!", "mrsmith");
        //When
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

        //Then
        Assertions.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    void testPost() {
        //Given
        ForumPost.ForumUser forumUser = new ForumPost.ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone! " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getPostBody(), thePost.getAuthor());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assertions.assertEquals(thePost, retrievedPost);
    }

    @Test
    void testGetComment() {
        //Given
        ForumPost.ForumUser forumUser = new ForumPost.ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        // Then
        Assertions.assertEquals(theComment, retrievedComment);
    }

    @Test
    void testRemovePostNotExisting() {
        //Given
        ForumPost.ForumUser forumUser = new ForumPost.ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testRemoveCommentNotExisting() {
        //Given
        ForumPost.ForumUser forumUser = new ForumPost.ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");

        //When
        boolean result = forumUser.removeComments(theComment);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testRemovePost() {
        //Give
        ForumPost.ForumUser forumUser = new ForumPost.ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyonee, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getPostBody(), thePost.getAuthor());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    void testRemoveComment() {
        ForumPost.ForumUser forumUser = new ForumPost.ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone!, " +
                "this is my first contribution here!", ",mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComments(theComment);

        //When
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }

}
