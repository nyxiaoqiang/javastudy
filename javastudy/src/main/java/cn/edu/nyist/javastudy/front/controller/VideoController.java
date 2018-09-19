package cn.edu.nyist.javastudy.front.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.nyist.javastudy.common.model.Video;
import cn.edu.nyist.javastudy.front.service.VideoService;

@Controller
public class VideoController {
	@Autowired
	private VideoService videoService;
	@ResponseBody
	@RequestMapping("/getVideos")
	public Map<String, Object> getAllVideos(@RequestParam(name="pageNo",defaultValue="1") int pageNo,@RequestParam(name="uid",required=false)int uid) {
		Page<Video> videos = videoService.getVideos(pageNo,1);
		for (Video video : videos) {
			System.out.println(video);
		}
		Map<String, Object> map =  new HashMap<>();
		map.put("videos", videos);
		return map;
	}
}
