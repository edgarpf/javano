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
public class AccountGetRequest {
	private String key;
	private final String action = Action.ACCOUNT_GET;
}
