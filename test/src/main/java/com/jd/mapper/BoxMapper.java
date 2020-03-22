package com.jd.mapper;

import java.util.List;

import com.jd.pojo.Box;

public interface BoxMapper {
	void addBox(Box box);

	List<Box> selectAllBoxes();

	Box selectBox(String symbol);
}
