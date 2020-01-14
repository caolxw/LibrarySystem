package com.hdu.library.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hdu.library.entry.User;

@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByName(String uName);
}