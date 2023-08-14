package com.example.be.controller;

import com.example.be.dto.DataResponseDto;
import com.example.be.service.HomeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping("/home")
    public DataResponseDto getHome(@RequestParam @Valid String place) throws IOException {

        return homeService.getHome(place);
    }
}
