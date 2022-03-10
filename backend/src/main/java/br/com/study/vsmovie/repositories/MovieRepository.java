package br.com.study.vsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.study.vsmovie.entites.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
