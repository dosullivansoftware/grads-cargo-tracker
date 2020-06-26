package com.smbcgroup.cargo_tracker.web.exception_mapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import osullivan.daniel.travel_helper.admin.NoRecordFoundException;

@Provider
public class NoRecordFoundExceptionMapper implements ExceptionMapper<NoRecordFoundException> {

	@Override
	public Response toResponse(final NoRecordFoundException exception) {
		String message = "No record with id: " + exception.getMessage();
		return Response.status(Response.Status.NO_CONTENT)
				.entity(message)
				.type(MediaType.TEXT_PLAIN)
				.build();
	}

}