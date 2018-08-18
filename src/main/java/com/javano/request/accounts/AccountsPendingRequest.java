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
public class AccountsPendingRequest {
	private String[] accounts;
	private String count;
	private String threshold;
	private Boolean source;
	private final String action = Action.ACCOUNTS_PENDING;
}
