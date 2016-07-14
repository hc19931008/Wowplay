package com.xtkj.wowplay.service;

import com.xtkj.wowplay.dto.SortDTO;
import com.xtkj.wowplay.entity.Sort;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
public interface SortService {

    /**
     * 取出一级分类和二级分类
     */
    List<SortDTO> getAllSortList();

}
