package com.example.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DeptManager implements Manager{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "DeptManager";
	}

}
