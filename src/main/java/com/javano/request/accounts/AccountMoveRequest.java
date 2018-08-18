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
public class AccountMoveRequest {
	private String wallet;
	private String source;
	private String[] accounts;
	private String action = Action.ACCOUNT_MOVE;
}
