package com.andy.ch08.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.andy.ch08.dto.Regions;

public interface IRegionsDao {

	public int insertRegion(SqlSession session, Regions regions);

	public int updateRegion(SqlSession session, Regions regions);

	public int deleteRegion(SqlSession session, int regionId);

	public Regions selectRegion(SqlSession session, int regionId);

	public List<Regions> selectAllRegions(SqlSession session);
}
