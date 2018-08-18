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
public class AccountRepresentativeSetRequest {
	private String wallet;
	private String account;
	private String representative;
	private Boolean work;
	private final String action = Action.ACCOUNT_REPRESENTATIVE_SET;
}
