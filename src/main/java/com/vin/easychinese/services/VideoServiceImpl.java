package com.vin.easychinese.services;

import com.vin.easychinese.model.Video;
import com.vin.easychinese.repositories.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    VideoRepository videoRepository;

    public VideoServiceImpl(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public List<Video> getVideos() {
        List<Video> videoInfos = new ArrayList<>();
        videoRepository.findAll().forEach(videoInfos::add);
        return videoInfos;
    }

    @Override
    public Video getVideoById(Long videoId) {
        return videoRepository.findById(videoId).get();
    }

    @Override
    public Video insert(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public void updateVideo(Long videoId, Video video) {
        Video videoFromDb = videoRepository.findById(videoId).get();
        System.out.println(videoFromDb.toString());
        videoFromDb.setDescription(video.getDescription());
        videoFromDb.setTitle(video.getTitle());
        videoRepository.save(videoFromDb);
    }

    @Override
    public void deleteVideo(Long videoId) {
        videoRepository.deleteById(videoId);
    }
}
