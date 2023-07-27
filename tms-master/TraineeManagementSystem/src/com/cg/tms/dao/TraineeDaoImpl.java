package com.cg.tms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.tms.entities.Trainee;
@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Trainee> fetchAllTrainee() {
		String jqpl="Select m from Trainee m";
		TypedQuery<Trainee> query=em.createQuery(jqpl,Trainee.class);
		return query.getResultList();
	}

	@Override
	public void insertTraineeDetails(Trainee tdetails) {
		em.persist(tdetails);
		
	}

	@Override
	public void deleteTrainee(Integer traineeId) {
		Trainee trainee=em.find(Trainee.class, traineeId);
		em.remove(trainee);
		
	}

	@Override
	public Trainee fetchOneTrainee(int traineeId) {
		
		Trainee tr=em.find(Trainee.class, traineeId);
		return tr;
		
	}

	@Override
	public void updateTraineeDetails(Trainee tUpdatedetails) {
		em.merge(tUpdatedetails);
		
	}

}

