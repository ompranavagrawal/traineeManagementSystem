package com.cg.tms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tms.dao.TraineeDao;
import com.cg.tms.entities.Trainee;

@Transactional
@Service
public class TraineeServiceImpl implements TraineeService {

	
	@Autowired
	TraineeDao tdao;
	
	@Override
	public List<Trainee> getAllTrainee() {
		// TODO Auto-generated method stub
		return tdao.fetchAllTrainee();
	}

	@Override
	public void insertTraineedetails(Trainee tdetails) {
		tdao.insertTraineeDetails(tdetails);                           //no return
		
	}

	@Override
	public void deleteTrainee(Integer traineeId) {
		tdao.deleteTrainee(traineeId);
		
	}

	@Override
	public Trainee fetchOneTrainee(int traineeId) {
		
		return tdao.fetchOneTrainee(traineeId);
	}

	@Override
	public void updateTraineeDetails(Trainee tUpdatedetails) {
		tdao.updateTraineeDetails(tUpdatedetails);                  //no return
		
	}

}
