package com.xcx.music.mapper;

import com.xcx.music.pojo.Roles;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicMapper {
    Roles test();
}
