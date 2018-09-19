package cn.edu.nyist.javastudy.common.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author 杨小治
 * @date 2018年9月15日 下午6:48:26
 * @contact QQ:1360365886
 * @explain 说明：错误信息表
 */
@Entity
@Table(name="t_error")
public class Error implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	private String name;//标题
	private String descri;//错误描述
	private String photo;//错误信息截图
	private int tid;//错误类型
	private int uid;//发布该错误信息的人
	@OneToMany(targetEntity=Solution.class)
	@JoinColumn(name="sid")
	private Set<Solution> solutions = new HashSet<>();//问题的解决办法
	
	public Error() {
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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

	public Set<Solution> getSolutions() {
		return solutions;
	}

	public void setSolutions(Set<Solution> solutions) {
		this.solutions = solutions;
	}
	
	
}
