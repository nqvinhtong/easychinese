package com.vin.easychinese.services;

import com.vin.easychinese.model.Video;

import java.util.List;

public interface VideoService {
    List<Video> getVideos();

    Video getVideoById(Long videoId);

    Video insert(Video video);

    void updateVideo(Long id, Video video);

    void deleteVideo(Long videoId);
}
