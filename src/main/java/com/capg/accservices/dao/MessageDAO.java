/**
 * 
 */
package com.capg.accservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.accservices.model.Message;

/**
 * @author bvembu
 *
 */
@Repository
@Transactional
public interface MessageDAO extends JpaRepository<Message,String> {
	List<Message> findByMd(String md);
}
