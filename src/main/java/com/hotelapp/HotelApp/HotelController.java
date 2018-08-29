package com.hotelapp.HotelApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hotelapp.HotelApp.jpa.HotelRepository;

@Controller
public class HotelController {

	@Autowired
	HotelRepository repo;

	@RequestMapping("/")
	public ModelAndView listCities() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("cities", repo.findDistinctCity());
		return mv;
	}

	@PostMapping("/hotels")
	public ModelAndView showHotels(@RequestParam("city") String city) {
		ModelAndView mv = new ModelAndView("listhotels");
		mv.addObject("list", repo.findByCityOrderByPriceDesc(city));
		mv.addObject("city", city);
		return mv;
		// return new ModelAndView("listhotels",
		// "list",repo.findByCityOrderByPriceDesc(city));
	}


}
