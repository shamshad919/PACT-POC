package com.example.bink.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BinkLoyaltyCard {

    private int loyalty_card_id;
    private String loyalty_plan_name;
    private Boolean is_fully_pll_linked;
    private boolean reward_available;
    private BinkLoyaltyCardStatus status;
    private BinkLoyaltyCardBalance balance;
    private List<LoyaltyCardImage> images;
    private BinkCard card;
}
