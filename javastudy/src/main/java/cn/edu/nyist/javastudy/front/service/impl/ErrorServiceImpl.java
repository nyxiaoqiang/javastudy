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

import cn.edu.nyist.javastudy.common.model.Error;
import cn.edu.nyist.javastudy.common.pageinfo.PageContent;
import cn.edu.nyist.javastudy.front.repostory.ErrorRepostory;
import cn.edu.nyist.javastudy.front.service.ErrorService;
@Service
public class ErrorServiceImpl implements ErrorService {
	@Autowired
	private ErrorRepostory errorRepostory;
	@Override
	public Page<Error> getErrors(int pageNum, int uid) {
		Pageable pageable = PageRequest.of(pageNum-1, PageContent.PAGE_SIZE);
		Specification<Error> spec = new Specification<Error>() {
			@Override
			public Predicate toPredicate(Root<Error> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				Predicate predicate =null;
				if (uid!=-1) {
					predicate = criteriaBuilder.equal(root.get("uid"), 1);
				}
				return predicate;
			}
		};
		//spec是条件限制，sort是分页
		return errorRepostory.findAll(spec, pageable);
	}
}
