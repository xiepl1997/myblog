package com.xpl.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xpl.blog.dao.UserInfoDao;
import com.xpl.blog.dao.UserRoleDao;
import com.xpl.blog.entity.UserRole;
import com.xpl.blog.enums.RoleEnum;
import com.xpl.blog.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


/**
 * 用户角色服务
 *
 * @author xiepl1997
 * @date 2021/08/10
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {


}
