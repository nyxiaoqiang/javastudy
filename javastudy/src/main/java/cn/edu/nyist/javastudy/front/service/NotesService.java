package cn.edu.nyist.javastudy.front.service;

import java.util.List;

import org.springframework.data.domain.Page;

import cn.edu.nyist.javastudy.common.model.Note;

public interface NotesService {
	//public Page<Note> getAll();
	public Page<Note> getAllNotes(int pageNum, int uid);
	public Note findOne(int id);
}
