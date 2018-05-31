package com.xcx.music.controller;

import com.xcx.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class MusicController {
    @Autowired
    MusicService musicService;

    @RequestMapping("/test")
    public String test(){
        return musicService.test();
    }
}
