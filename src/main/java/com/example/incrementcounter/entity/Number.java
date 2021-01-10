package com.example.incrementcounter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DeLLpc
 *
 */
@Entity
@Table(name = "number")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Number {

	@Id
	@Column(name = "id")
	Integer id;
	
	@Column(name = "num")
	Integer num;
}
