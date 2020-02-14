package com.system.dao;

import com.system.bean.PagingVO;
import com.system.bean.StudentCustom;
import com.system.bean.TeacherCustom;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jacey on 2017/6/29.
 */
public class TeacherMapperCustomTest {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
    }

    @Test
    public void findByPaging() throws Exception {
        TeacherMapperCustom teacherMapperCustom = (TeacherMapperCustom) applicationContext.getBean("teacherMapperCustom");
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(1);
        List<TeacherCustom> list =  teacherMapperCustom.findByPaging(pagingVO);
        System.out.println();
    }

}