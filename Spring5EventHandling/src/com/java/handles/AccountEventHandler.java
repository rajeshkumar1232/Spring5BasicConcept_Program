package com.java.handles;

import org.springframework.context.ApplicationListener;

import com.java.event.AccountEvent;

public class AccountEventHandler implements ApplicationListener<AccountEvent> {

	@Override
	public void onApplicationEvent(AccountEvent ae) {
		ae.genrateLog();
		
	}

}
