package com.xtkj.wowplay.dao.impl;

import com.xtkj.wowplay.dao.BaseDao;
import com.xtkj.wowplay.dao.TagDao;
import com.xtkj.wowplay.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/7/14 0014.
 */
@Repository("tagDao")
public class TagDaoImpl implements TagDao{

    @Autowired
    BaseDao baseDao;

    @Override
    public List<Tag> getTagBySortId(Integer sortId) {
        return baseDao.findByHql("from Tag t where t.sort.id =" +sortId);
    }

}
