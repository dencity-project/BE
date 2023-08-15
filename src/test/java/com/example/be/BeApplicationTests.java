package com.example.be;

import org.json.JSONObject;
import org.json.XML;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;




@SpringBootTest
class BeApplicationTests {

    @Test
    void contextLoads() {
    }

//    public static void main(String[] args) throws IOException {
//        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088/674d6f776761727234366278444f65/xml/citydata/1/5/POI001"); /*URL*/
//        urlBuilder.append("/" +  URLEncoder.encode("674d6f776761727234366278444f65","UTF-8") ); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
//        urlBuilder.append("/" +  URLEncoder.encode("xml","UTF-8") ); /*요청파일타입 (xml,xmlf,xls,json) */
//        urlBuilder.append("/" + URLEncoder.encode("citydata","UTF-8")); /*서비스명 (대소문자 구분 필수입니다.)*/
//        urlBuilder.append("/" + URLEncoder.encode("1","UTF-8")); /*요청시작위치 (sample인증키 사용시 5이내 숫자)*/
//        urlBuilder.append("/" + URLEncoder.encode("5","UTF-8")); /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/
//        // 상위 5개는 필수적으로 순서바꾸지 않고 호출해야 합니다.
//
//        // 서비스별 추가 요청 인자이며 자세한 내용은 각 서비스별 '요청인자'부분에 자세히 나와 있습니다.
////        urlBuilder.append("/" + URLEncoder.encode("20220301","UTF-8")); /* 서비스별 추가 요청인자들*/
//        urlBuilder.append("/" + URLEncoder.encode("POI001","UTF-8")); /* 서비스별 추가 요청인자들*/
//
//
//        URL url = new URL(urlBuilder.toString());
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//        conn.setRequestProperty("Content-type", "application/json");
//        System.out.println("Response code: " + conn.getResponseCode()); /* 연결 자체에 대한 확인이 필요하므로 추가합니다.*/
//        BufferedReader rd;
//
//
//
//        // 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
//        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        } else {
//            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//        }
//        StringBuilder sb = new StringBuilder();
//        String line;
//        while ((line = rd.readLine()) != null) {
//            sb.append(line);
//        }
//        rd.close();
//        conn.disconnect();
//
//        JSONObject jobj = XML.toJSONObject(String.valueOf(sb));
//
////        System.out.println(jobj.toString(4));
////        System.out.println(sb.toString());
//
//        // "AREA_CONGEST_LVL" 필드를 받아옵니다.
//        JSONObject seoulRtd = jobj.getJSONObject("SeoulRtd.citydata");
//        JSONObject cityData = seoulRtd.getJSONObject("CITYDATA");
//        JSONObject livePpltnStts1 = cityData.getJSONObject("LIVE_PPLTN_STTS");
//        JSONObject livePpltnStts2 = livePpltnStts1.getJSONObject("LIVE_PPLTN_STTS");
//        String areaCongestLevel = livePpltnStts2.getString("AREA_CONGEST_LVL");
//
//        // "AREA_CONGEST_LVL" 값을 출력합니다.
//        System.out.println("AREA_CONGEST_LVL:");
//        System.out.println(areaCongestLevel);
//    }
}
