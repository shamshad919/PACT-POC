package com.example.bink.controller;

import com.example.bink.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bink")
public class BinkController {

    @GetMapping("/loyalty-cards-overview")
    public BinkLoyaltyCardsOverviewResponse getBinkCardOverview() {
        return  getResponse();
    }

    private BinkLoyaltyCardsOverviewResponse getResponse() {

        BinkLoyaltyCard binkLoyaltyCard1 = BinkLoyaltyCard.builder()
                .loyalty_card_id(100)
                .loyalty_plan_name("Iceland")
                .is_fully_pll_linked(false)
                .reward_available(false)
                .card(getBinkCard())
                .balance(getBalance())
                .status(getStatus())
                .images(getImages()).build();

        BinkLoyaltyCard binkLoyaltyCard2 = BinkLoyaltyCard.builder()
                .loyalty_card_id(101)
                .loyalty_plan_name("Wasabi")
                .is_fully_pll_linked(true)
                .reward_available(true)
                .card(getBinkCard())
                .balance(getBalance())
                .status(getStatus())
                .images(getImages()).build();

        BinkLoyaltyCardsOverviewResponse response = new BinkLoyaltyCardsOverviewResponse();
        response.setLoyalty_cards(Arrays.asList(binkLoyaltyCard1, binkLoyaltyCard2));
        return  response;
    }

    private BinkCard getBinkCard() {
        return BinkCard.builder()
                .barcode("12345")
                .barcode_type(0)
                .colour("ffff")
                .card_number("12345")
                .text_colour("#fffff").build();
    }

    private BinkLoyaltyCardBalance getBalance() {
        return BinkLoyaltyCardBalance.builder()
                .body_text("body text")
                .current_display_value("10")
                .current_value("10")
                .target_value("100")
                .loyalty_currency_name("Points")
                .prefix("prefix")
                .suffix("suffix")
                .last_updated_at("2432545756").build();
    }

    private BinkLoyaltyCardStatus getStatus(){
        return BinkLoyaltyCardStatus.builder()
                .state("authorised")
                .slug("")
                .description("")
                .build();
    }

    private List<LoyaltyCardImage> getImages() {
        LoyaltyCardImage loyaltyCardImage = LoyaltyCardImage.builder()
                .description("Hero image")
                .id(1)
                .encoding("png")
                .url("url")
                .type(0)
                .build();

        return Arrays.asList(loyaltyCardImage);
    }

}
