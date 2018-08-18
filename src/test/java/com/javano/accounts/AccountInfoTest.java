package com.javano.accounts;

import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.google.gson.Gson;
import com.javano.TestTemplate;
import com.javano.response.accounts.AccountInfoResponse;

public class AccountInfoTest extends TestTemplate{
	@Test
	public void test() throws IOException {
		stubFor(post("/")
			   .willReturn(okJson(new Gson().toJson(new AccountInfoResponse
					   ("FF84533A571D953A596EA401FD41743AC85D04F406E76FDE4408EAED50B473C5",
							   "991CF190094C00F0B68E2E5F75F6BEE95A2E0BD93CEAA4A6734DB9F19B728948", 
							   "991CF190094C00F0B68E2E5F75F6BEE95A2E0BD93CEAA4A6734DB9F19B728948", 
							   "235580100176034320859259343606608761791", "1501793775", "33")))));		
		
		assertEquals("FF84533A571D953A596EA401FD41743AC85D04F406E76FDE4408EAED50B473C5", nanoClient.getAccountInfo("xrb_3e3j5tkog48pnny9dmfzj1r16pg8t1e76dz5tmac6iq689wyjfpi00000000", null, null, null).getFrontier());
	}
}
