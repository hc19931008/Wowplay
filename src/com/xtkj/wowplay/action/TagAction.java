package com.xtkj.wowplay.action;

import com.xtkj.wowplay.dto.TagDTO;
import com.xtkj.wowplay.service.SortService;
import com.xtkj.wowplay.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/7/14 0014.
 */
public class TagAction extends BaseAction{

    @Autowired
    TagService tagService;


    public void  getTagListBySortId(){
        String sortId = getRequest().getParameter("sortid");
        List<TagDTO> tagList = tagService.getTagListBySortId(sortId);
    }

}
