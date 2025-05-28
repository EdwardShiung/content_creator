package com.edward.springboot.bus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_blog")
public class Blog {
    // Primary key ID
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    // Blog title
    private String title;

    // Blog content
    private String content;

    // Cover image on the homepage
    private String firstPicture;

    // Flag (e.g., original, repost)
    private String flag;

    // Number of views
    private Integer views;

    // Number of likes
    private Integer clicklike;

    // Whether appreciation (tipping) is enabled
    private boolean appreciation;

    // Whether sharing is allowed
    private boolean shareStatement;

    // Whether comments are allowed
    private boolean commentabled;

    // Whether the blog is published
    private boolean published;

    // Whether the blog is recommended
    private boolean recommend;

    // Creation timestamp
    private Date createTime;

    // Last update timestamp
    private Date updateTime;

    // ID of the category it belongs to
    private Integer typeId;

    // Deletion status (0: not deleted, 1: deleted)
    private Integer delStatus;

    // ID of the author
    private Integer userId;

    // Blog description/preview
    private String description;
}
