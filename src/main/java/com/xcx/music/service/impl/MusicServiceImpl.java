package com.xcx.music.service.impl;

import com.xcx.music.mapper.MusicMapper;
import com.xcx.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicMapper musicMapper;

    @Override
    public String test() {
        return musicMapper.test().toString();
    }
}
