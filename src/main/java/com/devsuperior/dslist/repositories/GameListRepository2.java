package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository2 extends JpaRepository <GameList, Long>{// tipo da entidade e tipo de id

}
