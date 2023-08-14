package com.example.be.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    Not_Match_User(HttpStatus.BAD_REQUEST.value(), "P001", "작성자가 일치하지 않습니다.");

    private final int status;
    private final String code;
    private final String message;
}
