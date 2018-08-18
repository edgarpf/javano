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
public class AccountsCreateRequest {
	private String wallet;
	private String count;
	private Boolean work;
	private final String action = Action.ACCOUNTS_CREATE;
}
