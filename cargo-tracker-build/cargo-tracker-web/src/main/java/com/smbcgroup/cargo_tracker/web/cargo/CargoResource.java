package com.smbcgroup.cargo_tracker.web.cargo;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.smbcgroup.cargo_tracker.cargo.CargoService;

import osullivan.daniel.travel_helper.admin.Cargo;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("cargo")
public class CargoResource {

	@Inject
	private CargoService cargoService;

	@GET
	@Path("{id}")
	public Cargo findById(@PathParam("id") Long id) {
		return cargoService.findById(id);
	}

}