package com.xpl.blog.dao;

import com.xpl.blog.entity.Message;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * 留言
 *
 * @author xiepl1997
 * @date 2021/08/10
 */
@Repository
public interface MessageDao extends BaseMapper<Message> {

}
