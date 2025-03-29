package com.savan.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savan.bike.modal.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
