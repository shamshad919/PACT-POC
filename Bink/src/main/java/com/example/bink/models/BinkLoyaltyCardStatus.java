package com.example.bink.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude
public class BinkLoyaltyCardStatus {

    private String state;
    private String slug;
    private String description;
    public void setDescription(String description) {
        if(description == null) {
            this.description = "";
        }
        else {
            this.description = description;
        }
    }

}
