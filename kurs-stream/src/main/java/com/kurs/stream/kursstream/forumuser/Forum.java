package com.kurs.stream.kursstream.forumuser;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Adam", 'M', 1, LocalDate.of(1988, 1,1)));
        userList.add(new ForumUser(2, "Ela", 'K', 4, LocalDate.of(1990, 10,11)));
        userList.add(new ForumUser(3, "Piotr", 'M', 5, LocalDate.of(2000, 12,1)));
        userList.add(new ForumUser(4, "Pawel", 'M', 2, LocalDate.of(2013, 6,4)));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
