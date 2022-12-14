package com.example.bink.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude
public class BinkLoyaltyCardBalance {

    private String last_updated_at;
    private String current_display_value;
    private String loyalty_currency_name;
    private String prefix;
    private String suffix;
    private String current_value;
    private String target_value;
    private String body_text;
}
