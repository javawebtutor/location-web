package com.jwt.location.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.location.app.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
