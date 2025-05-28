package com.edward.springboot.bus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edward.springboot.bus.domain.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper extends BaseMapper<Blog> {
}
