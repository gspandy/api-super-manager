package com.an9elkiss.api.manager.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.an9elkiss.api.manager.model.Share;

public interface ShareDao {

	int save(Share share);
	
	List<Share> findAllByPage(@Param("searchParams") Map<String, ?> searchParams);
}