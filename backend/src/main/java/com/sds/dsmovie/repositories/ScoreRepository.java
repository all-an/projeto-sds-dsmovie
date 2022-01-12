package com.sds.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds.dsmovie.entities.Score;
import com.sds.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
