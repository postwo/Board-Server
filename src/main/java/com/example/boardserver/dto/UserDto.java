package com.example.boardserver.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class UserDto {

    public enum Status{
        DEFAULT,ADMIN,DELETED
    }
    //private을 사용한 이유는 캡슐화를 하기 위해서

    private int id;
    private String userID;
    private String password;
    private String nickName;
    private boolean isAdmin;
    private Date createdTime;
    private boolean isWithDraw; //사용자 탈퇴 여부
    private Status status;//회원 상태
    private Date updateTime;
}
