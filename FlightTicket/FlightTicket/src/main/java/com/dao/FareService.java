package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Fare;

@Service
public class FareService {
	
	@Autowired
	FareDAO FareDAOImpl;
	
	public void modifyFare(Fare fare)
	{
		FareDAOImpl.modifyFare(fare);
	}
	
}
