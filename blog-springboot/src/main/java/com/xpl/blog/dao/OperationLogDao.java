package com.xpl.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xpl.blog.entity.Menu;
import com.xpl.blog.entity.OperationLog;
import org.springframework.stereotype.Repository;


/**
 * 操作日志
 *
 * @author xiepl1997
 * @date 2021/08/10
 */
@Repository
public interface OperationLogDao extends BaseMapper<OperationLog> {
}
