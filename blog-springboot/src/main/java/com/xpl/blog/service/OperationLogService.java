package com.xpl.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xpl.blog.dto.OperationLogDTO;
import com.xpl.blog.vo.PageResult;
import com.xpl.blog.entity.OperationLog;
import com.xpl.blog.vo.ConditionVO;

/**
 * 操作日志服务
 *
 * @author xiepl1997
 * @date 2021/07/29
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
