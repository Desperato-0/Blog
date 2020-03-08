package com.cky.myblog;

import com.cky.myblog.dao.*;
import com.cky.myblog.entity.BlogConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyblogApplicationTests {
    @Autowired
    private BlogTagMapper blogTagMapper;
    @Autowired
    private BlogTagRelationMapper relationMapper;

    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    @Autowired
    private BlogConfigMapper configMapper;

    @Autowired
    private BlogCommentMapper commentMapper;

    @Autowired
    private BlogMapper blogMapper;

    @Test
    public void testCategories(){
        int count = blogCategoryMapper.getTotalCategories(null);
        System.out.println(count);
    }

    @Test
    public void testConfig(){
        List<BlogConfig> list = configMapper.selectAll();
        System.out.println(list);
    }

    @Test
    public void testComment(){
        int count = commentMapper.getTotalBlogComments(null);
        System.out.println(count);
    }

    @Test
    public void testBlog(){
        int count = blogMapper.getTotalBlogs(null);
        System.out.println(count);
    }
}
