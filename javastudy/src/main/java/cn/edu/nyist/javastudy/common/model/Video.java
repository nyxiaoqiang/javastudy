package cn.edu.nyist.javastudy.common.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * 
 * @author 杨小治
 * @date 2018年9月15日 下午6:45:32
 * @contact QQ:1360365886
 * @explain 说明：视频实体类
 */
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="t_video")
public class Video implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	private String name;//视频名称
	private String newname;//上传到服务器的视频名称
	private String descri;//视频描述
	private Date pubdate;//视频发布时间
	private int pageview;//视频浏览量
	//@Transient
	private int uid;//用户id
//	@Transient
	private int tid;//视频类型
//	@ManyToOne(targetEntity=Type.class)
//	@JoinColumn(name="tid")
//	private Type type;//创建关联
//	@ManyToOne(targetEntity=User.class)
//	@JoinColumn(name="uid")
//	private User user;//
	public Video() {
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
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
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
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Video [id=" + id + ", name=" + name + ", newname=" + newname + ", descri=" + descri + ", pubdate="
				+ pubdate + ", pageview=" + pageview + ", uid=" + uid + ", tid=" + tid + "]";
	}
	
}
