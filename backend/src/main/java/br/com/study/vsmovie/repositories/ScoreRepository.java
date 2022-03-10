package br.com.study.vsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.study.vsmovie.entites.Score;
import br.com.study.vsmovie.entites.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
