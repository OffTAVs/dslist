package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;

import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository2;


@Service //Registro de componete 
public class GameListService {

	@Autowired
	private GameListRepository2 gameListRepository2;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository2.findAll();
		return  result.stream().map(x -> new GameListDTO(x)).toList();
		
		
		// ou pode ser feito como return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
