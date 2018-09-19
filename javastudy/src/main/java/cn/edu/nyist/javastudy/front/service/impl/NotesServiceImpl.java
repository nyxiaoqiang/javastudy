package cn.edu.nyist.javastudy.front.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import cn.edu.nyist.javastudy.common.model.Note;
import cn.edu.nyist.javastudy.common.pageinfo.PageContent;
import cn.edu.nyist.javastudy.front.repostory.NoteRepostory;
import cn.edu.nyist.javastudy.front.service.NotesService;
@Service
public class NotesServiceImpl implements NotesService{
	@Autowired
	private NoteRepostory noteRepostory;
	@Override

	public Page<Note> getAllNotes(int pageNum,int uid){
	
		Pageable pageable = new PageRequest(pageNum-1, PageContent.PAGE_SIZE);
		Specification<Note> spec = new Specification<Note>() {
			@Override
			public Predicate toPredicate(Root<Note> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				Predicate predicate =null;
				if (uid!=-1) {
					predicate = criteriaBuilder.equal(root.get("uid"), 1);
				}
				return predicate;
			}
		};
		//spec是条件限制，sort是分页
		return noteRepostory.findAll(spec, pageable);
	}
	@Override
	public Note findOne(int id) {
		
		return noteRepostory.findById(1);
	}
}
