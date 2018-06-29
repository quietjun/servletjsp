package com.andy.ch08.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Regions implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** REGION_ID. */
	private Integer regionId;

	/** REGION_NAME. */
	private String regionName;

	/**
	 * 생성자.
	 */
	public Regions() {
	}

	public Regions(Integer regionId) {
		this(regionId, null);
	}

	public Regions(Integer regionId, String regionName) {
		this();
		this.regionId = regionId;
		this.regionName = regionName;
	}

	/**
	 * REGION_ID을 설정합니다..
	 * 
	 * @param regionId
	 *            REGION_ID
	 */
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	/**
	 * REGION_ID을 가져옵니다..
	 * 
	 * @return REGION_ID
	 */
	public Integer getRegionId() {
		return this.regionId;
	}

	/**
	 * REGION_NAME을 설정합니다..
	 * 
	 * @param regionName
	 *            REGION_NAME
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	/**
	 * REGION_NAME을 가져옵니다..
	 * 
	 * @return REGION_NAME
	 */
	public String getRegionName() {
		return this.regionName;
	}

}
