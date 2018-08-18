package com.javano.response.accounts;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountInfoResponse {
   private String frontier;
   @SerializedName("open_block")
   private String openBlock;
   @SerializedName("representative_block")
   private String representativeBlock;
   private String balance;
   @SerializedName("modified_timestamp")
   private String modifiedTimestamp;
   @SerializedName("block_count")
   private String blockCount;
}