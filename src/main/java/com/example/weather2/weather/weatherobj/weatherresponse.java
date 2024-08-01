package com.example.weather2.weather.weatherobj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data @JsonIgnoreProperties(ignoreUnknown = true)
public class weatherresponse {
    float latitude;
    float longitude;
    @JsonProperty("current")
    currentdetails current;//Did'nt use List<> like in georesponse as this is returning only one object
}

@Data @JsonIgnoreProperties(ignoreUnknown = true)
class location
{
    float latitude, longitude;
    List<units> current_units;
}

@Data @JsonIgnoreProperties(ignoreUnknown = true)
class units
{
    String temperature_2m;
}
