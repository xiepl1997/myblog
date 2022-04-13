package com.xpl.blog.strategy;

import com.xpl.blog.dto.UserInfoDTO;

/**
 * 第三方登录策略
 *
 * @author xiepl1997
 * @date 2021/07/28
 */
public interface SocialLoginStrategy {

    /**
     * 登录
     *
     * @param data 数据
     * @return {@link UserInfoDTO} 用户信息
     */
    UserInfoDTO login(String data);

}
