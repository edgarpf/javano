package com.javano.response.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountBalanceResponse {
	private String balance;
	private String pending;
}
