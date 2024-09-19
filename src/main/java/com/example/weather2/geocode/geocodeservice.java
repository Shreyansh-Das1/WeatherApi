package com.example.weather2.geocode;

import com.example.weather2.geocode.geobj.georesponse;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Async
@Service
public class geocodeservice {
    private final String apiurl = "https://geocoding-api.open-meteo.com/v1/search";


    public georesponse getcode(String location) {
        RestTemplate restTemplate = new RestTemplate();
        String url = apiurl + "?name=" + location.trim().replace(' ','+')+"&count=1";
        georesponse response = restTemplate.getForObject(url, georesponse.class);
        return response;
    }
}
