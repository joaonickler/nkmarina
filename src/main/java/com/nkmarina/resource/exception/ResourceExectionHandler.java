package com.nkmarina.resource.exception;

import org.springframework.boot.devtools.restart.server.HttpRestartServer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nkmarina.service.execption.ObjetcNotFoundExecption;



@ControllerAdvice
public class ResourceExectionHandler {

	@ExceptionHandler(ObjetcNotFoundExecption.class)
	public ResponseEntity<StandardError> objectNotFound(ObjetcNotFoundExecption e, HttpRestartServer request){

		StandardError err  = new StandardError(HttpStatus.NOT_FOUND.value() , e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
	
}