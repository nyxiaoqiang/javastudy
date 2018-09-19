package cn.edu.nyist.javastudy.front.service;

import org.springframework.data.domain.Page;

import cn.edu.nyist.javastudy.common.model.Error;

public interface ErrorService {
	Page<Error> getErrors(int pageNum, int uid);
}
