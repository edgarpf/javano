package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountsPendingRequest extends ActionRequest {
	private String[] accounts;
	private String count;
	private String threshold;
	private Boolean source;
	
	public AccountsPendingRequest(String[] accounts, String count) {
		action = Action.ACCOUNTS_PENDING;
		this.accounts = accounts;
		this.count = count;
	}

	public AccountsPendingRequest(String[] accounts, String count, String threshold) {
		this(accounts, count);
		this.threshold = threshold;
	}
	
	public AccountsPendingRequest(String[] accounts, String count, Boolean source) {
		this(accounts, count);
		this.source = source;
	}
}
