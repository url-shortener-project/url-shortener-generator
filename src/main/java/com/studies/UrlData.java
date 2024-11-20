package com.studies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
public class UrlData {

    private String originalUrl;
    private long expirationTime;

}
