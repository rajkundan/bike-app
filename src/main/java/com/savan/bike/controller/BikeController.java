package com.savan.bike.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.savan.bike.modal.Bike;
import com.savan.bike.repositories.BikeRepository;
import com.savan.bike.service.BikeService;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {

	@Autowired
	private BikeRepository bikeRepository;
	
	@Autowired
	private BikeService bikeService;

//	@GetMapping
//	public List<Bike> list() {
//		return bikeRepository.findAll();
//	}
	
//	@GetMapping
//	public ResponseEntity<Map<String, Object>> list(
//	        @RequestParam(defaultValue = "0") int page,
//	        @RequestParam(defaultValue = "10") int size) {
//
//	    try {
//	        Pageable paging = PageRequest.of(page, size);
//	        Page<Bike> pageBikes = bikeService.fetchBikePage(paging);
//	        
//	        List<Bike> bikes = pageBikes.getContent();
//	        
//	        Map<String, Object> response = new HashMap<>();
//	        response.put("bikes", bikes);
//	        response.put("currentPage", pageBikes.getNumber());
//	        response.put("totalItems", pageBikes.getTotalElements());
//	        response.put("totalPages", pageBikes.getTotalPages());
//	        
//	        return new ResponseEntity<>(response, HttpStatus.OK);
//	        
//	    } catch (Exception e) {
//	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	}
	
	@GetMapping
	public List<Bike> list(@RequestParam(value="pageNumber", defaultValue = "1",required = false) Integer pageNumber,
			@RequestParam(value="pageSize", defaultValue = "5",required = false) Integer pageSize) {
		return bikeService.fetchBikeList(pageNumber,pageSize);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		bikeRepository.save(bike);

	}

	@PostMapping("/batch")
	@ResponseStatus(HttpStatus.OK)
	public void createBatch(@RequestBody List<Bike> bikes) {
		// Option 1: Using saveAll() method
		bikeRepository.saveAll(bikes);

	}

	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		return bikeRepository.findById(id).orElseThrow(() -> new RuntimeException("Bike not found"));
	}

}
