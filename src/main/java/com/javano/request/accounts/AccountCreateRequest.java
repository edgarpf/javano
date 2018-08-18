package com.javano.request.accounts;

import com.javano.util.Action;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountCreateRequest {
	private String wallet;
	private Boolean work;
	private final String action = Action.ACCOUNT_CREATE;
}
