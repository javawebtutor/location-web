package com.jwt.location.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwt.location.app.entity.Location;
import com.jwt.location.app.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;

	@RequestMapping("/showcreate")
	public String showCreate() {
		return "createlocation";
	}

	@RequestMapping("/saveloc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location saveLocation = locationService.saveLocation(location);
		String msg = "Location saved with ID: " + saveLocation.getId();
		modelMap.addAttribute("msg", msg);
		return "createlocation";

	}

}
