package com.hotelapp.HotelApp.jpa;

import java.util.List;
import java.util.TreeSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotelapp.HotelApp.entity.Hotel;

// second parameter has to match the primary key in your SQL database (Long)
public interface HotelRepository extends JpaRepository<Hotel, Long> {

	// Hotel matches the POJO so it's capitalized
	@Query("select distinct city from Hotel")
	TreeSet<String> findDistinctCity();
	

	List<Hotel> findByCityOrderByPriceDesc(String city);

//	@Query("find by city from Hotel")
//	TreeSet<String> findByCity(String c);

}
