package cn.edu.nyist.javastudy.common.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @author 杨小治
 * @date 2018年9月15日 下午6:36:56
 * @contact QQ:1360365886
 * @explain 说明：笔记表
 */
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="t_note")
public class Note implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	private String name;//笔记名称
	private String newname;//上传到服务器的文件名
	private Date pubdate;//笔记上传时间
	private int pageview;//笔记浏览量
	private String descri;//笔记描述
//	@Transient
	private int uid;//用户id
//	@Transient
	private int tid;//类型id
	//@ManyToOne(targetEntity=Type.class)
//	@JoinColumn(name="tid")
//	private Type type;//关联类型
//	//@ManyToOne(targetEntity=User.class)
//	@JoinColumn(name="uid")
//	private User user;
	
	public Note() {
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNewname() {
		return newname;
	}



	public void setNewname(String newname) {
		this.newname = newname;
	}


	@DateTimeFormat(pattern="yyyy-MM-dd")
	public Date getPubdate() {
		return pubdate;
	}



	public void setPubdate(Date pubdate) {
		
		this.pubdate = pubdate;
	}



	public int getPageview() {
		return pageview;
	}



	public void setPageview(int pageview) {
		this.pageview = pageview;
	}



	public String getDescri() {
		return descri;
	}



	public void setDescri(String descri) {
		this.descri = descri;
	}



	public int getUid() {
		return uid;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}



	public int getTid() {
		return tid;
	}



	public void setTid(int tid) {
		this.tid = tid;
	}




	@Override
	public String toString() {
		return "Note [id=" + id + ", name=" + name + ", newname=" + newname + ", pubdate=" + pubdate + ", pageview="
				+ pageview + ", descri=" + descri + ", uid=" + uid + ", tid=" + tid 
				 + "]";
	}
}
