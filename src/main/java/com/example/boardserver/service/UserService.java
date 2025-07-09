package com.example.boardserver.service;

import com.example.boardserver.dto.UserDto;

public interface UserService {

    //회원가입
    void register(UserDto userProfile);

    //로그인
    UserDto login(String id, String password);

    //중복 아이디 검사
    boolean isDuplicateId(String id);

    //유저정보 조회
    UserDto getUserInfo(String id);

    //패스워드 변경
    void updatePassword(String id, String beforePassword,String afterPassword);

    //계정 삭제
    void deleteId(String id,String password);

}
