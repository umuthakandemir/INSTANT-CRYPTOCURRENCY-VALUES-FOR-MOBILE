package com.demirgroup.cryptocurrencyapplication.model;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;
import java.util.List;

public class CryptoModel {
    @SerializedName("name")
    public String name;
    @SerializedName("image")
    public String image;
    @SerializedName("last_updated")
    public String last_updated;
    @SerializedName("current_price")
    public String current_price;
}
