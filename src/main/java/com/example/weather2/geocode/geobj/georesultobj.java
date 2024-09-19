package com.example.weather2.geocode.geobj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.Nullable;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class georesultobj {
    String name;
     float longitude;
     float latitude;
     @Nullable String remark;
}
