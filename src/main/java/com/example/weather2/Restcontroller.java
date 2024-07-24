package com.example.weather2;

import com.example.weather2.geocode.geobj.georesultobj;
import com.example.weather2.geocode.geocodeservice;
import com.example.weather2.geocode.geobj.georesponse;
import com.example.weather2.weather.weatherobj.weatherresponse;
import com.example.weather2.weather.weatherservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class Restcontroller {
    private final geocodeservice service = new geocodeservice();
    private georesponse geocode = new georesponse();
    private georesultobj coords;

    //private weatherresponse weather = new weatherresponse();
    private weatherservice weatherserv = new weatherservice();
    @GetMapping("/geocode")
    public @ResponseBody weatherresponse fetch(@RequestBody String location)
    {
        geocode= service.getcode(location);
         coords = geocode.getResults().get(0);
        return weatherserv.service(coords.getLongitude() , coords.getLatitude());

    }
}
