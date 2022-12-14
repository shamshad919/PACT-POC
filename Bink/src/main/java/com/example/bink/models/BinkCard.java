package com.example.bink.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BinkCard {

    private String barcode;
    private Integer barcode_type;
    private String card_number;
    private String colour;
    private String text_colour;

}
