package com.sias.mybatisx.mapper;
import org.apache.ibatis.annotations.Param;

import com.sias.mybatisx.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Edga会飞的小猪
* @description 针对表【tuser】的数据库操作Mapper
* @createDate 2022-07-09 22:01:44
* @Entity com.sias.mybatisx.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);



}




