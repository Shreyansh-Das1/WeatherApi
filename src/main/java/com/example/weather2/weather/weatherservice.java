package com.example.weather2.weather;

import com.example.weather2.weather.weatherobj.weatherresponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class weatherservice {

    public weatherresponse service(float longitude, float latitude)
    {
        RestTemplate restTemplate2 = new RestTemplate();
        String url="https://api.open-meteo.com/v1/forecast?latitude="+format(latitude)+"&longitude="+format(longitude)+"&current=temperature_2m,relative_humidity_2m";
        weatherresponse response = restTemplate2.getForObject(url, weatherresponse.class);
        System.out.println("URL: "+url+"\n Response: "+response);
        return response;
    }

    private String format(float coord) {    return String.format("%.2f", coord).trim();    }

}
