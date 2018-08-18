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
public class AccountBlockCountRequest {
    private String account;
    private final String action = Action.BLOCK_COUNT;
}
