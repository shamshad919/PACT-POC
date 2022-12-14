package com.example.bink.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude
public class LoyaltyCardImage {

    private Integer id;
    private Integer type;
    private String url;
    private String description;
    private String encoding;
    private void setDescription(String description) {
        if(description == null) {
            this.description = "";
        } else {
          this.description = description;
        }
    }


}
