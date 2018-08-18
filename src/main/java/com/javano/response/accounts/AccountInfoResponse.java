package com.javano.response.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountInfoResponse {
   private String frontier;
   private String openBlock;
   private String representativeBlock;
   private String balance;
   private String modifiedTimestamp;
   private String blockCount;
}