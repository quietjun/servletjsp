package com.andy.ch08.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.andy.ch08.dto.Regions;

public class RegionsDaoImpl implements IRegionsDao {

	// singleton design pattern 적용
	private static RegionsDaoImpl instance = new RegionsDaoImpl();

	public static RegionsDaoImpl getInstance() {
		return instance;
	}

	private final String NS = "com.example.dao.RegionsMapper.";

	@Override
	public int insertRegion(SqlSession session, Regions regions)  {
		int result = -1;
		// TODO: regions 객체를 저장하시오.
		// END:
		return result;
	}

	@Override
	public int updateRegion(SqlSession session, Regions regions)  {
		int result = -1;
		// TODO: regions 객체를 수정하시오.
		// END:
		return result;
	}

	@Override
	public int deleteRegion(SqlSession session, int regionId)  {
		int result = -1;
		// TODO: regionsId에 해당하는 정보를 삭제하시오.
		// END:
		return result;
	}

	@Override
	public Regions selectRegion(SqlSession session, int regionId)  {
		Regions region = null;
		// TODO: regionId에 해당하는 정보를 리턴하시오.
		// END:
		return region;
	}

	@Override
	public List<Regions> selectAllRegions(SqlSession session)  {
		List<Regions> regions = null;
		// TODO: 모든 regions 정보를 리턴하시오.
		// END:
		return regions;
	}
}
