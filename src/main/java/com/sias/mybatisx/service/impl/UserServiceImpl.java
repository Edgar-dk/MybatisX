package com.sias.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sias.mybatisx.entity.User;
import com.sias.mybatisx.service.UserService;
import com.sias.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Edga会飞的小猪
* @description 针对表【tuser】的数据库操作Service实现
* @createDate 2022-07-09 22:01:44
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




