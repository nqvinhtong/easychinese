package com.vin.easychinese.controllers;

import com.vin.easychinese.model.Video;
import com.vin.easychinese.services.VideoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/video")
public class VideoController {
    VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping
    public ResponseEntity<List<Video>> getAllVideos() {
        List<Video> videoInfos = videoService.getVideos();
        return new ResponseEntity<>(videoInfos, HttpStatus.OK);
    }

    @GetMapping({"/{videoId}"})
    public ResponseEntity<Video> getVideo(@PathVariable Long videoId) {
        return new ResponseEntity<>(videoService.getVideoById(videoId), HttpStatus.OK);
    }

    public ResponseEntity<Video> saveVideoInfo(@RequestBody Video video) {
        Video video1 = videoService.insert(video);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("video", "/api/video/" + video1.getVideoId().toString());
        return new ResponseEntity<>(video1, httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{videoId}"})
    public ResponseEntity<Video> updateVideo(@PathVariable("videoId") Long videoId, @RequestBody Video video) {
        videoService.updateVideo(videoId, video);
        return new ResponseEntity<>(videoService.getVideoById(videoId), HttpStatus.OK);
    }

    @DeleteMapping({"/{videoId}"})
    public ResponseEntity<Video> deleteVideo(@PathVariable("videoId") Long videoId) {
        videoService.deleteVideo(videoId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
