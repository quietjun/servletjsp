package com.andy.ch08.service;

import java.util.List;

import com.andy.ch08.dto.Regions;

public interface IRegionService {

	int insertRegion(Regions regions);

	int updateRegion(Regions regions);

	int deleteRegion(int regionId);

	Regions selectRegionDetail(int regionId);

	List<Regions> selectAllRegions();
}
