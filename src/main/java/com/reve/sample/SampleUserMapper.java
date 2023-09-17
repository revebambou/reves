package com.reve.sample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleUserMapper {
	//查
    public List<SampleUser> findAll();
    /**
     * insert
     * @return
     */
    public int insertUser(SampleUser user);
}
