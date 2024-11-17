package com.esybytes.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esybytes.account.entity.Account;
@Repository
public interface AccountsRepository extends JpaRepository<Account, Long>{

}
