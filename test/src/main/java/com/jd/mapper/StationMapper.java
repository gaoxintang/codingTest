package com.jd.mapper;

import java.util.List;

import com.jd.pojo.Station;

public interface StationMapper {
	void addStation(Station station);

	List<Station> selectStations();

	Station selectStation(String symbol);
}
