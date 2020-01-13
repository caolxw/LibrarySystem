package com.hdu.library.mapper;

import com.hdu.library.entry.User;
import java.util.List;

public interface UserMapper {

    int deleteByPrimaryKey(Integer uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByName(String uName);
}