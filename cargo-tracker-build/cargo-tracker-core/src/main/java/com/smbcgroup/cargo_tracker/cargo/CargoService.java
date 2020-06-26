package com.smbcgroup.cargo_tracker.cargo;

import javax.ejb.Stateless;
import javax.inject.Inject;

import osullivan.daniel.travel_helper.admin.Cargo;
import osullivan.daniel.travel_helper.admin.CargoRepository;

@Stateless
public class CargoService {

	@Inject 
	private CargoRepository cargoRepository;
	
	public Cargo findById(Long id) {
		return cargoRepository.findById(id);
	}

}
