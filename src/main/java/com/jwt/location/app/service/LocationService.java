package com.jwt.location.app.service;

import java.util.List;

import com.jwt.location.app.entity.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(int id);

	Location getLocationById(int id);

	List<Location> getAllLocations();

}
