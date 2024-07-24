package com.example.weather2.geocode.geobj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class georesultobj {
    String name;
     float longitude;
     float latitude;
}
