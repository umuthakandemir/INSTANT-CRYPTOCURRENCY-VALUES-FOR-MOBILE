package com.demirgroup.cryptocurrencyapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demirgroup.cryptocurrencyapplication.R;
import com.demirgroup.cryptocurrencyapplication.databinding.CryptorecylerviewrowBinding;
import com.demirgroup.cryptocurrencyapplication.model.CryptoModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CryptoAdapter extends RecyclerView.Adapter<CryptoAdapter.CryptoHolder> {
    ArrayList<CryptoModel> cryptoModels;

    public CryptoAdapter(ArrayList<CryptoModel> cryptoModels) {
        this.cryptoModels = cryptoModels;
    }

    @NonNull
    @Override
    public CryptoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CryptorecylerviewrowBinding cryptorecylerviewrowBinding=CryptorecylerviewrowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new CryptoHolder(cryptorecylerviewrowBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull CryptoHolder holder, int position) {
        Picasso.get().load(cryptoModels.get(position).image).into(holder.cryptorecylerviewrowBinding.imageView);
        holder.cryptorecylerviewrowBinding.btcName.setText(cryptoModels.get(position).name);
        holder.cryptorecylerviewrowBinding.btcPrice.setText(cryptoModels.get(position).current_price + " $");
    }

    @Override
    public int getItemCount() {
        return cryptoModels.size();
    }

    public class CryptoHolder extends RecyclerView.ViewHolder{
        CryptorecylerviewrowBinding cryptorecylerviewrowBinding;
        public CryptoHolder(CryptorecylerviewrowBinding cryptorecylerviewrowBinding) {
            super(cryptorecylerviewrowBinding.getRoot());
            this.cryptorecylerviewrowBinding=cryptorecylerviewrowBinding;
        }
    }
}
