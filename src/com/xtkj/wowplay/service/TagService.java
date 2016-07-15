package com.xtkj.wowplay.service;

import com.xtkj.wowplay.dto.SortDTO;
import com.xtkj.wowplay.dto.TagDTO;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
public interface TagService {

    /**
     * 取出tag表标签
     */
    List<TagDTO> getTagListBySortId(String sortId);



}
