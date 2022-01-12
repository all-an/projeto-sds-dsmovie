package com.sds.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
