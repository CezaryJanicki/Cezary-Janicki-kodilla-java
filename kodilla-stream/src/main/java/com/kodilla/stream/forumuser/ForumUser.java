package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userIndividualNumber;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int noOfPosts;

    public ForumUser(final int userIndividualNumber, final String userName, final char gender, final LocalDate birthDate, final int noOfPosts) {
        this.userIndividualNumber = userIndividualNumber;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.noOfPosts = noOfPosts;
    }

    public int getUserIndividualNumber() {
        return userIndividualNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getYear() { return birthDate.getYear();}

    public int getNoOfPosts() {
        return noOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userIndividualNumber=" + userIndividualNumber +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", noOfPosts=" + noOfPosts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userIndividualNumber != forumUser.userIndividualNumber) return false;
        if (gender != forumUser.gender) return false;
        if (noOfPosts != forumUser.noOfPosts) return false;
        if (userName != null ? !userName.equals(forumUser.userName) : forumUser.userName != null) return false;
        return birthDate != null ? birthDate.equals(forumUser.birthDate) : forumUser.birthDate == null;
    }

    @Override
    public int hashCode() {
        int result = userIndividualNumber;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) gender;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + noOfPosts;
        return result;
    }
}
