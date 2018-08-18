package com.javano.request.accounts;

import com.javano.util.Action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoRequest {
    private String account;
	private Boolean representative;
	private Boolean weight;
	private Boolean pending;
	private final String action = Action.ACCOUNT_INFO;
}
