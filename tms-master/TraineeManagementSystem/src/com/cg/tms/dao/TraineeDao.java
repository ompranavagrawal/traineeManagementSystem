package com.cg.tms.dao;

import java.util.List;


import com.cg.tms.entities.Trainee;

public interface TraineeDao {
	List<Trainee> fetchAllTrainee();
	void insertTraineeDetails(Trainee tdetails);
	public void deleteTrainee(Integer traineeId);
	Trainee fetchOneTrainee(int traineeId);
	void updateTraineeDetails(Trainee tUpdatedetails);
}
