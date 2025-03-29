package com.savan.bike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.savan.bike.modal.Bike;
import com.savan.bike.repositories.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService {
	
	@Autowired
    private BikeRepository bikeRepository;

	@Override
	public List<Bike> fetchBikeList(Integer pageNumber,Integer pageSize) {
		
		
		 Pageable paging = PageRequest.of(pageNumber,pageSize);
		 Page<Bike> page=bikeRepository.findAll(paging);
	        List<Bike> list=page.getContent();
	      
		// TODO Auto-generated method stub
		 return list;
	}
	
//	 @Override
//	    public Page<Bike> fetchBikePage(Pageable pageable) {
//	        return bikeRepository.findAll(pageable);
//	    }
	
}
