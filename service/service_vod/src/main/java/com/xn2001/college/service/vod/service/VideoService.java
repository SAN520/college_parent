package com.xn2001.college.service.vod.service;

import com.aliyuncs.exceptions.ClientException;

import java.io.InputStream;

/**
 * @author 乐心湖
 * @date 2020/7/18 17:13
 **/
public interface VideoService {
    String uploadVideo(InputStream file, String originalFilename);
    void removeVideo(String videoId) throws ClientException;
}
