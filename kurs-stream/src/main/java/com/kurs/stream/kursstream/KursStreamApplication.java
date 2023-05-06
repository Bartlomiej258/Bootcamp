package com.kurs.stream.kursstream;

import com.kurs.stream.kursstream.beautifier.PoemBeautifier;
import com.kurs.stream.kursstream.book.Book;
import com.kurs.stream.kursstream.book.BookDirectory;
import com.kurs.stream.kursstream.forumuser.Forum;
import com.kurs.stream.kursstream.forumuser.ForumUser;
import com.kurs.stream.kursstream.iterate.NumberGenerator;
import com.kurs.stream.kursstream.person.People;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class KursStreamApplication {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear()  >= 20)
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

       forumUserMap.entrySet().stream()
               .map(entry -> entry.getKey() + ": " + entry.getValue())
               .forEach(System.out::println);
    }
}
