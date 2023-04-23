package com.example.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumPost {

    private String postBody;
    private String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (postBody != null ? !postBody.equals(forumPost.postBody) : forumPost.postBody != null) return false;
        return author != null ? author.equals(forumPost.author) : forumPost.author == null;
    }

    @Override
    public int hashCode() {
        int result = postBody != null ? postBody.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ForumPost{" +
                "postBody='" + postBody + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static class ForumUser {

        private String name;
        private String realName;
        private List<ForumPost> posts = new ArrayList<>();
        private List<ForumComment> comments = new LinkedList<>();

        public ForumUser(String name, String realName) {
            this.name = name;
            this.realName = realName;
        }

        public void addPost(String postBody, String author) {
            ForumPost thePost = new ForumPost(postBody, author);
            posts.add(thePost);
        }

        public void addComment(ForumPost thePost, String author, String commentBody) {
            ForumComment theComment = new ForumComment(thePost, commentBody, author);
            comments.add(theComment);
        }

        public int getPostsQuantity() {
            return posts.size();
        }

        public int getCommentsQuantity() {
            return comments.size();
        }

        public ForumPost getPost(int postNumber) {
            if (postNumber >= 0 && postNumber <= posts.size()) {
                return posts.get(postNumber);
            }
            return null;
        }

        public ForumComment getComment(int commentNumber) {
            ForumComment theComment = null;
            if (commentNumber >= 0 && commentNumber <= comments.size()) {
                theComment = comments.get(commentNumber);
            }
            return theComment;
        }

        public boolean removePost(ForumPost thePost) {
            boolean result = false;
            if (posts.contains(thePost)) {
                posts.remove(thePost);
                result = true;
            }
            return result;
        }

        public boolean removeComments(ForumComment theComment) {
            boolean result = false;
            if (comments.contains(theComment)) {
                comments.remove(theComment);
                result = true;
            }
            return result;
        }

        public String getName() {
            return name;
        }

        public String getRealName() {
            return realName;
        }

        @Override
        public String toString() {
            return "ForumUser{" +
                    "name='" + name + '\'' +
                    ", realName='" + realName + '\'' +
                    ", posts=" + posts +
                    ", comments=" + comments +
                    '}';
        }
    }
}
