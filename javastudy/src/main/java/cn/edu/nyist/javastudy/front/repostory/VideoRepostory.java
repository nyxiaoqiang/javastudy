package cn.edu.nyist.javastudy.front.repostory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.edu.nyist.javastudy.common.model.Video;

public interface VideoRepostory extends CrudRepository<Video, Integer>,JpaSpecificationExecutor<Video>,PagingAndSortingRepository<Video, Integer>{
	List<Video> findAll();
}
