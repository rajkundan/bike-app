package com.savan.bike.service;

import java.util.List;

import com.savan.bike.modal.Bike;

public interface BikeService {
	
	 List<Bike> fetchBikeList(Integer pageNumber,Integer pageSize);

}
