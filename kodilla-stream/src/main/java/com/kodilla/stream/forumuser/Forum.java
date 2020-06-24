package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Mr T", 'M', LocalDate.of(1999, Month.APRIL, 11),6));
        forumUserList.add(new ForumUser(2, "Dziarskihank", 'M', LocalDate.of(1987, Month.APRIL, 15),0));
        forumUserList.add(new ForumUser(3, "Zbigniew", 'M', LocalDate.of(1991, Month.JANUARY, 01),5));
        forumUserList.add(new ForumUser(4, "Tosia", 'F', LocalDate.of(1987, Month.APRIL, 25),2));
        forumUserList.add(new ForumUser(5, "Wiesiu", 'M', LocalDate.of(1974, Month.FEBRUARY, 11),7));
        forumUserList.add(new ForumUser(6, "Polak", 'M', LocalDate.of(2000, Month.SEPTEMBER, 22),0));
        forumUserList.add(new ForumUser(7, "Sidney", 'M', LocalDate.of(1988, Month.MARCH, 20),12));
        forumUserList.add(new ForumUser(8, "Mama", 'F', LocalDate.of(1991, Month.APRIL, 3),3));
        forumUserList.add(new ForumUser(9, "Poker", 'M', LocalDate.of(1995, Month.MARCH, 14),4));
        forumUserList.add(new ForumUser(10, "Ona", 'F', LocalDate.of(2001, Month.DECEMBER, 9),8));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}