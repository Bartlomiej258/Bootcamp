package com.kurs.stream.kursstream.portfolio;

public class User {

    private final String user;
    private final String realName;

    public User(final String user, final String realName) {
        this.user = user;
        this.realName = realName;
    }

    public String getUser() {
        return user;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user1 = (User) o;

        if (user != null ? !user.equals(user1.user) : user1.user != null) return false;
        return realName != null ? realName.equals(user1.realName) : user1.realName == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        return result;
    }
}
