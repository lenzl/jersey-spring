package com.mkyong.transaction;

import org.springframework.stereotype.Component;

@Component
public class TransactionBoImpl implements TransactionBo{

	public String save() {
		
		return "Jersey + Spring example";
		
	}

}
