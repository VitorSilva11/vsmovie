package br.com.study.vsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.study.vsmovie.dto.MovieDTO;
import br.com.study.vsmovie.dto.ScoreDTO;
import br.com.study.vsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	
	@Autowired
	private ScoreService service;

	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
	
}
