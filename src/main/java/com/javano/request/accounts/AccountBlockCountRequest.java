package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountBlockCountRequest extends ActionRequest {
private String account;
	
	public AccountBlockCountRequest(String account) {
	  action = Action.BLOCK_COUNT;
	  this.account = account;
	}
}
