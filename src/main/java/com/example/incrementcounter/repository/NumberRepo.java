package com.example.incrementcounter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.incrementcounter.entity.Number;

/**
 * @author DeLLpc
 *
 */
@Repository
public interface NumberRepo extends JpaRepository<Number, Integer> {

}
