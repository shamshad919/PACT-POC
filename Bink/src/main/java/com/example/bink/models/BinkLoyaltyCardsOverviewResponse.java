package com.example.bink.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude
public class BinkLoyaltyCardsOverviewResponse {

    private List<BinkLoyaltyCard> loyalty_cards;

}
