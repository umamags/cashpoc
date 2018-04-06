/**
 * 
 */
package com.capg.accservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author bvembu
 *
 */
@Configuration
@Component
@Entity
@Table(name = "Message", schema = "public")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "number")
	int number;
	@Column(name = "md")
	String md;
}
