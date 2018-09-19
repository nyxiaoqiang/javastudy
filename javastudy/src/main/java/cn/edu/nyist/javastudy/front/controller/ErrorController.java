package cn.edu.nyist.javastudy.front.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.nyist.javastudy.common.model.Error;
import cn.edu.nyist.javastudy.front.service.ErrorService;

@RestController
public class ErrorController {
	@Autowired
	private ErrorService errorService;

	@RequestMapping("/getErrors")
	public Map<String, Object> getMyErrors(@RequestParam(name="pageNo",defaultValue="1") int pageNo,@RequestParam(required=false,defaultValue="-1") int uid) {
		Page<Error> errors=errorService.getErrors(pageNo, uid);
		Map<String, Object> map = new HashMap<>();
		map.put("errors", errors);
		return map;
	}
}
