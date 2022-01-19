package com.example.project_bigbangk.model.Orders;

import com.example.project_bigbangk.model.Asset;
import com.example.project_bigbangk.model.Wallet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;

/**
 * Model created by Vanessa Philips.
 * Object "Limit_Buy" > Buy transaction if the price reaches below a desired level.
 */

public class Limit_Buy extends AbstractOrder{

    private final Logger logger = LoggerFactory.getLogger(Limit_Buy.class);

    private Wallet buyerWallet;

    public Limit_Buy(int orderId, double requestedPrice, double assetAmout, LocalDateTime date) {
        super(orderId, requestedPrice, assetAmout, date);
        logger.info("New Limit_Buy, without Asset and Wallet");
    }

    public Limit_Buy(Asset asset, double requestedPrice, double assetAmount, LocalDateTime date, Wallet buyerWallet) {
        super(asset, requestedPrice, assetAmount, date);
        this.buyerWallet = buyerWallet;
        logger.info("New Limit_Buy, without id");
    }

    public Wallet getBuyerWallet() {
        return buyerWallet;
    }

    public void setBuyerWallet(Wallet buyerWallet) {
        this.buyerWallet = buyerWallet;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limit_Buy{" +
                ", buyerWallet=" + buyerWallet +
                '}';
    }
}