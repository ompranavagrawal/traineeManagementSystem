package com.cg.tms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Trainee")
public class Trainee {
	@Id
	@Column(name="traineeId")
	public Integer traineeId;
	
	@Column(name="traineeName")
	public String traineeName;
	
	@Column(name="traineeDomain")
	public String traineeDomain;
	
	@Column(name="traineeLocation")
	public String traineeLocation;

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName="
				+ traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	 
	
	
}
