package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser(String final username, String final realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
