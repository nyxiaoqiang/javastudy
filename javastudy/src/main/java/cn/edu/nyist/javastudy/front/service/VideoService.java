package cn.edu.nyist.javastudy.front.service;

import org.springframework.data.domain.Page;

import cn.edu.nyist.javastudy.common.model.Video;

public interface VideoService {
	public Page<Video> getVideos(int pageNum,int uid);
}
