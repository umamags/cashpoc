
package com.capg.accservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.accservices.model.Account;

@Repository
@Transactional
public interface AccountDao extends JpaRepository<Account,Long> {
	List<Account> findByCustomerId(int customerId);
	Account findByAccountNo(int accountNo);
}
