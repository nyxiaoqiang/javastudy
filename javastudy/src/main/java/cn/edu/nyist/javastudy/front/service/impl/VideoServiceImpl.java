package cn.edu.nyist.javastudy.front.service.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import cn.edu.nyist.javastudy.common.model.Video;
import cn.edu.nyist.javastudy.front.Repostory.VideoRepostory;
import cn.edu.nyist.javastudy.front.service.VideoService;
@Service
public class VideoServiceImpl implements VideoService {
	@Autowired
	private VideoRepostory videoRepostory;
	@Override
	public Page<Video> getVideos(int pageNum,int uid) {
		Pageable pageable = new PageRequest(pageNum-1, 3);
		Specification<Video> spec = new Specification<Video>() {
			@Override
			public Predicate toPredicate(Root<Video> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				Predicate predicate =null;
				if (uid!=-1) {
					predicate = criteriaBuilder.equal(root.get("uid"), 1);
				}
				return predicate;
			}
		};
		//spec是条件限制，sort是分页
		return videoRepostory.findAll(spec, pageable);
	}

}
