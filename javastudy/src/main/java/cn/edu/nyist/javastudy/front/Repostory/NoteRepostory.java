package cn.edu.nyist.javastudy.front.Repostory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.edu.nyist.javastudy.common.model.Note;

public interface NoteRepostory extends CrudRepository<Note, Integer>,JpaSpecificationExecutor<Note>,PagingAndSortingRepository<Note, Integer>{//,JpaSpecificationExecutor<Note>,PagingAndSortingRepository<Note, Integer>
	Note findById(int id);
	List<Note> findAll();
	
}
