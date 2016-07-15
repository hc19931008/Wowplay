package com.xtkj.wowplay.action;

import com.xtkj.wowplay.dto.CourseDTO;
import com.xtkj.wowplay.dto.TagDTO;
import com.xtkj.wowplay.service.CourseService;
import com.xtkj.wowplay.service.SortService;
import com.xtkj.wowplay.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/7/14 0014.
 */
public class CourseAction extends BaseAction{

    @Autowired
    private TagService tagService;
    @Autowired
    private SortService sortService;
    @Autowired
    private CourseService courseService;


    public void initCoursePage() {
        String sortId = getRequest().getParameter("sortId");
        List<TagDTO> tagListBySortId = tagService.getTagListBySortId(sortId);
        List<CourseDTO> courseListSortId = courseService.getCourseListBySortId(sortId);

    }

}
