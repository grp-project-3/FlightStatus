package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Fare;

@Repository
public interface FareDAO {

	public void modifyFare(Fare fare);
	
}