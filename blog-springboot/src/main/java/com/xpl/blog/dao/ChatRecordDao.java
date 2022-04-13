package com.xpl.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xpl.blog.entity.ChatRecord;
import org.springframework.stereotype.Repository;

/**
 * 聊天记录
 *
 * @author xiepl1997
 * @date 2021/08/10
 */
@Repository
public interface ChatRecordDao extends BaseMapper<ChatRecord> {
}
