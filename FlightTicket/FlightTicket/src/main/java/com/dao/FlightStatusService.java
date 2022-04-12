package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.FlightStatus;

@Service
public class FlightStatusService {
	
	@Autowired
	FlightStatusDAO FlightStatusDAOImpl;
	
	public void add(FlightStatus status)
	{
		FlightStatusDAOImpl.addFlightStatus(status);
	}
	public boolean update(FlightStatus status)
	{
		return FlightStatusDAOImpl.updateFlightStatus(status);
	}
	public boolean delete(FlightStatus status)
	{
		return FlightStatusDAOImpl.deleteFlightStatus(status);
	}
	public FlightStatus find(int id)
	{
		return FlightStatusDAOImpl.findFlightStatus(id);
	}
	public List<FlightStatus> findAll()
	{
		return FlightStatusDAOImpl.findAllFlightStatus();
	}

}
