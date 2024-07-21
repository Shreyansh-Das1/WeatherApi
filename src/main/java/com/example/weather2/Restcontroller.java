package com.example.weather2;

import com.example.weather2.geocode.geocodeservice;
import com.example.weather2.geocode.georesponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class Restcontroller {
    private final geocodeservice service = new geocodeservice();
    //private final weatherapi weather = new weatherapi();
    private georesponse geocode = new georesponse();
    @GetMapping("/geocode")
    public @ResponseBody String fetch(@RequestBody String location)
    {
        geocode= service.getcode(location);

    }
}
