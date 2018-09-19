package cn.edu.nyist.javastudy.front.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import cn.edu.nyist.javastudy.common.model.Note;
import cn.edu.nyist.javastudy.front.service.NotesService;
@RestController
public class NotesController {
	@Autowired
	private NotesService notevice;
	@RequestMapping("/getNotes")
	//@ResponseBody
	public Map<String, Object> getNotes(HttpServletRequest request,@RequestParam(name="pageNo",defaultValue="1") int pageNo,@RequestParam(required=false,defaultValue="-1") int uid){
		request.getSession().setAttribute("admin", "sbbbbbbbbb");
		Note note =	notevice.findOne(1);
		System.out.println(note+"-------------");
		Page< Note> notes = notevice.getAllNotes(pageNo,uid);
		for (Note note1 : notes) {
			System.out.println("所有数据"+note+"-----------");
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("notes", notes);
		return map;
	}
}
