package cn.edu.nyist.javastudy.front.repostory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.edu.nyist.javastudy.common.model.Error;
import cn.edu.nyist.javastudy.common.model.Note;

public interface ErrorRepostory extends CrudRepository<Error, Integer>,JpaSpecificationExecutor<Error>,PagingAndSortingRepository<Error, Integer>{
	List<Error> findAll();
}
