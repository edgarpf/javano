package com.javano.accounts;

import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import com.javano.TestTemplate;
import com.google.gson.Gson;
import com.javano.response.accounts.AccountBalanceResponse;

public class AccountBalanceTest extends TestTemplate {
	@Test
	public void test() throws IOException {
		stubFor(post("/")
			   .willReturn(okJson(new Gson().toJson(new AccountBalanceResponse("10000","10000")))));		
		assertEquals("10000", nanoClient.getAccountBalance("xrb_3e3j5tkog48pnny9dmfzj1r16pg8t1e76dz5tmac6iq689wyjfpi00000000").getBalance());
	}
}
