package com.example.be.service;

import com.example.be.dto.DataResponseDto;
import com.example.be.dto.GlobalResponseDto;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@Service
@RequiredArgsConstructor
public class HomeService {

    @Transactional
    public DataResponseDto getHome(String place) throws IOException {

        String[] placeList = new String[]{"POI012", "POI013", "POI014", "POI033", "POI040", "POI055", "POI068", "POI072", "POI101", "POI109"};
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            if (place.equals(placeList[i])) cnt = i;
        }

        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088/674d6f776761727234366278444f65/xml/citydata/1/5/"); /*URL*/
        urlBuilder.append(placeList[cnt]);
        urlBuilder.append("/" + URLEncoder.encode("674d6f776761727234366278444f65", "UTF-8")); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
        urlBuilder.append("/" + URLEncoder.encode("xml", "UTF-8")); /*요청파일타입 (xml,xmlf,xls,json) */
        urlBuilder.append("/" + URLEncoder.encode("citydata", "UTF-8")); /*서비스명 (대소문자 구분 필수입니다.)*/
        urlBuilder.append("/" + URLEncoder.encode("1", "UTF-8")); /*요청시작위치 (sample인증키 사용시 5이내 숫자)*/
        urlBuilder.append("/" + URLEncoder.encode("5", "UTF-8")); /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/

        urlBuilder.append("/" + URLEncoder.encode(placeList[cnt], "UTF-8")); /* 서비스별 추가 요청인자들*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");

        BufferedReader rd;

        // 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();

        JSONObject jobj = XML.toJSONObject(String.valueOf(sb));

        return new DataResponseDto(jobj);
    }
}
