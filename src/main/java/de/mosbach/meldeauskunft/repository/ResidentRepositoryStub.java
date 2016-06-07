package de.mosbach.meldeauskunft.repository;

import java.util.List;

import de.mosbach.meldeauskunft.domain.Resident;

public class ResidentRepositoryStub implements ResidentRepository{
	
	private List<Resident> residents;
	
	public ResidentRepositoryStub(List<Resident> liste){
		residents = liste;
	}
	public List<Resident> getResidents() {
		// TODO Auto-generated method stub
		return residents;
	}
}
