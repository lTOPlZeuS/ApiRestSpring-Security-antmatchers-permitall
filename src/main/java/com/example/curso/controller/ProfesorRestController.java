package com.example.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.entity.Profesor;
import com.example.curso.service.ProfesorServiceImp;

@RestController
public class ProfesorRestController {
	@Autowired
	private ProfesorServiceImp profesorService;
	
	@RequestMapping(value="/todos_public",method=RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listaAllProfesores(){
		List<Profesor> profesores = profesorService.findAllProfesores();
		if(profesores.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<List<Profesor>>(profesores,HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/todos_admin",method=RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listaAllProfesoresAdmin(){
		List<Profesor> profesores = profesorService.findAllProfesores();
		if(profesores.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<List<Profesor>>(profesores,HttpStatus.OK);
		}
	}

	@RequestMapping(value="/todos_user",method=RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listaAllProfesoresUser(){
		List<Profesor> profesores = profesorService.findAllProfesores();
		if(profesores.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<List<Profesor>>(profesores,HttpStatus.OK);
		}
	}
}
