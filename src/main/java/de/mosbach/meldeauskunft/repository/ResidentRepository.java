package de.mosbach.meldeauskunft.repository;

import java.util.List;

import de.mosbach.meldeauskunft.domain.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}