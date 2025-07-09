package com.example.boardserver.controller;

import com.example.boardserver.service.UserService;
import com.example.boardserver.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Log4j2
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;
}
