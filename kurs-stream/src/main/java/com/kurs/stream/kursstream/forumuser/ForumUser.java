package com.kurs.stream.kursstream.forumuser;

import java.time.LocalDate;
import java.util.Locale;

public class ForumUser {

    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(int id, String name, char sex, int posts, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(dateOfBirth.getYear(), dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (id != forumUser.id) return false;
        if (sex != forumUser.sex) return false;
        if (posts != forumUser.posts) return false;
        if (name != null ? !name.equals(forumUser.name) : forumUser.name != null) return false;
        return dateOfBirth != null ? dateOfBirth.equals(forumUser.dateOfBirth) : forumUser.dateOfBirth == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + posts;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}
