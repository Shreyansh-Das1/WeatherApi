package com.example.weather2.geocode;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class geocodeservice {
    private final String apiurl = "https://geocoding-api.open-meteo.com/v1/search";


    public georesponse getcode(String location) {
        RestTemplate restTemplate = new RestTemplate();
        String url = apiurl + "?name=" + location.trim().replace(' ','+')+"&count=1";
        ResponseEntity<georesponse> response = restTemplate.getForEntity(url, georesponse.class);
        System.out.println(response.getBody());
        return response.getBody();
    }
}
