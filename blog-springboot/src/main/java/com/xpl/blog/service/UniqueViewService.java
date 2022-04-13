package com.xpl.blog.service;

import com.xpl.blog.dto.UniqueViewDTO;
import com.xpl.blog.entity.UniqueView;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 用户量统计
 *
 * @author xiepl1997
 * @date 2021/07/29
 */
public interface UniqueViewService extends IService<UniqueView> {

    /**
     * 获取7天用户量统计
     *
     * @return 用户量
     */
    List<UniqueViewDTO> listUniqueViews();

}
