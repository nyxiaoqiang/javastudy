package cn.edu.nyist.javastudy.common.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 
 * @author 杨小治
 * @date 2018年9月15日 下午6:31:52
 * @contact QQ:1360365886
 * @explain 说明：管理员实体类
 */
@Entity
@Table(name="t_admin",uniqueConstraints=@UniqueConstraint(columnNames="name"))
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String pwd;
	
	public Admin() {
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
}
