package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountHistoryRequest extends ActionRequest {
	private String account;
	private String count;
	
	public AccountHistoryRequest(String account, String count) {
	  action = Action.ACCOUNT_HISTORY;
	  this.account = account;
	  this.count = count;
	}
}
