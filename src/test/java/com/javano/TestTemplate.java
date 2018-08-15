package com.javano;

import org.junit.Rule;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

public class TestTemplate {
	@Rule
	public WireMockRule wireMockRule = new WireMockRule(7076);
	protected NanoClient nanoClient = new NanoClient();
}
