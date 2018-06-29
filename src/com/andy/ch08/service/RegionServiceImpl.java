package com.andy.ch08.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.andy.ch08.dao.IRegionsDao;
import com.andy.ch08.dao.RegionsDaoImpl;
import com.andy.ch08.dto.Regions;

public class RegionServiceImpl implements IRegionService {
	private static final Logger logger = LoggerFactory.getLogger(RegionServiceImpl.class);

	private static RegionServiceImpl instance = new RegionServiceImpl();

	public static RegionServiceImpl getInstance() {
		return instance;
	}

	IRegionsDao rDao = RegionsDaoImpl.getInstance();

	@Override
	public int insertRegion(Regions regions) {
		int result = -1;
		// TODO: regions 정보를 DB에 저장하시오.
		// END:
		return result;
	}

	@Override
	public int updateRegion(Regions regions) {
		int result = -1;
		// TODO: regions 정보를 수정하시오.
		// END:

		return result;
	}

	@Override
	public int deleteRegion(int regionId) {
		int result = -1;
		// TODO: regionId에 해당하는 정보를 삭제하시오.
		// END:
		return result;
	}

	@Override
	public Regions selectRegionDetail(int regionId) {
		Regions result = null;
		// TODO: regionId에 해당하는 정보를 조회하시오.
		// END:
		return result;
	}

	@Override
	public List<Regions> selectAllRegions() {
		List<Regions> result = null;
		// TODO: 모든 국가 정보를 조회하시오.
		// END:
		return result;
	}
}
