package com.esybytes.account.impl;

import org.springframework.stereotype.Service;

import com.esybytes.account.dto.CustomerDto;
import com.esybytes.account.repository.AccountsRepository;
import com.esybytes.account.repository.CustomerRepository;
import com.esybytes.account.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService{

	
	private AccountsRepository accountsRepository;
	private CustomerRepository customerRepository;
	@Override
	public void createAccount(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

}
