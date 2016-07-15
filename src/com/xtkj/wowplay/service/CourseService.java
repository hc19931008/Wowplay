package com.xtkj.wowplay.service;

import com.xtkj.wowplay.dto.CourseDTO;

import java.util.List;

/**
 * Created by Administrator on 2016/7/15 0015.
 */
public interface CourseService {


    /**根据sortId查找course集合*/
    List<CourseDTO> getCourseListBySortId(String sortId);

}
