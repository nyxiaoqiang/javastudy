package cn.edu.nyist.javastudy.front.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.nyist.javastudy.common.model.Video;
import cn.edu.nyist.javastudy.front.service.VideoService;

@Controller
public class VideoController {
	@Autowired
	private VideoService videoService;
	@RequestMapping("/getVedios")
	public Map<String, Object> getAllVideos() {
		Page<Video> videos = videoService.getVideos(1,1);
		Map<String, Object> map =  new HashMap<>();
		map.put("videos", videos);
		return map;
	}
}
