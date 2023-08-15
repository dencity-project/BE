package com.example.be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import java.util.List;

@Getter
@NoArgsConstructor
public class DataResponseDto {

//    private JSONObject jsonObject;
    private String jsonObject;

    public DataResponseDto(String jsonObject) {

        this.jsonObject = jsonObject;
    }
}
