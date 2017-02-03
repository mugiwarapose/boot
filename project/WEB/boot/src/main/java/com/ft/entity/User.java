package com.ft.entity;

/**
 * Created by poseture on 2017/2/3.
 */
public class User {
    private String userId;

    private Long userNum;

    private String username;

    private String password;

    private String active;

    private Long memberId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getUserNum() {
        return userNum;
    }

    public void setUserNum(Long userNum) {
        this.userNum = userNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userNum=" + userNum +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active='" + active + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}
