package com.example.be.dto;

import com.example.be.Exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GlobalResponseDto<T> {

    private int status;
    private T data;
    private T msg;



    public static <T> GlobalResponseDto<Object> success(T data, String msg) {
        return new GlobalResponseDto<>(200, data, msg);
    }

    public static GlobalResponseDto<String> fail(ErrorCode errorCode) {
        return new GlobalResponseDto<>(errorCode.getStatus(), errorCode.getCode(), errorCode.getMessage());
    }

    public static GlobalResponseDto<String> fail(String msg) {
        return new GlobalResponseDto<>(400,null,msg);
    }
}
