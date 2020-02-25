package com.cky.myblog.service;

import com.cky.myblog.entity.BlogTagCount;
import com.cky.myblog.utils.PageQueryUtil;
import com.cky.myblog.utils.PageResult;

import java.util.List;

public interface TagService {

    /**
     * 查询标签的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
