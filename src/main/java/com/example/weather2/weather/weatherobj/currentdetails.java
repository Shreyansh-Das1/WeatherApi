package com.example.weather2.weather.weatherobj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
//@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class currentdetails {
    String time;
    float temperature_2m;
    float relative_humidity_2m;
}
