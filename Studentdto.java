package com.sample.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Studentdto {
    private long prod_id;
    private String productname;
    private long price;
    private float rating;
    private int  discount;
    private String availability;
    
}