package com.edward.springboot.bus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edward.springboot.bus.domain.Blog;
import com.edward.springboot.bus.mapper.BlogMapper;
import com.edward.springboot.bus.service.BlogService;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
}
