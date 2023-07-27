package com.cg.tms.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.tms.entities.Trainee;
@Service
public interface TraineeService {
	List<Trainee> getAllTrainee(); //to display details
	void insertTraineedetails(Trainee tdetails);//to insert details
	public void deleteTrainee(Integer traineeId) ;//to delete trainee
	public Trainee fetchOneTrainee(int traineeId);//to fetch one
	public void updateTraineeDetails(Trainee tUpdatedetails);//to update details
}