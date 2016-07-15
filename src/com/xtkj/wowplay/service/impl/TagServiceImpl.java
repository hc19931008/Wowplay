package com.xtkj.wowplay.service.impl;


import com.xtkj.wowplay.dao.TagDao;

import com.xtkj.wowplay.dto.TagDTO;

import com.xtkj.wowplay.entity.Tag;
import com.xtkj.wowplay.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
@Service("tagService")
public class TagServiceImpl implements TagService {

    private TagDao tagDao;

    @Override
    public List<TagDTO> getTagListBySortId(String sortId) {
        List<TagDTO> tagList = new ArrayList<TagDTO>();
        List<Tag> tags = tagDao.getTagBySortId(Integer.valueOf(sortId));
        for (Tag tag : tags) {
            tagList.add(new TagDTO(tag.getId(), tag.getName()));
        }
        return tagList;
    }


    /*getter and setter*/
    public TagDao getTagDao() {
        return tagDao;
    }

    @Resource(name = "tagDao")
    public void setTagDao(TagDao tagDao) {
        this.tagDao = tagDao;
    }
}
