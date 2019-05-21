package com.jwt.location.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.location.app.entity.Location;
import com.jwt.location.app.repo.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(int id) {
		locationRepository.deleteById(id);

	}

	@Override
	public Location getLocationById(int id) {
		return locationRepository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

}
