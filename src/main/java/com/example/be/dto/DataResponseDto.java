package com.example.be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import java.util.List;

@Getter
@NoArgsConstructor
public class DataResponseDto {

    private JSONObject jsonObject;

    public DataResponseDto(JSONObject jsonObject) {

        this.jsonObject = jsonObject;
    }
}
