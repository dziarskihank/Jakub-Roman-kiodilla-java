package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostsQty() >= 1)
                .collect(Collectors.toMap(ForumUser::getIDNumber, ForumUser -> ForumUser));

        System.out.println("# elements: " + mapOfForumUsers.size());
        mapOfForumUsers.entrySet().stream()
                .forEach(System.out::println);
    }
}