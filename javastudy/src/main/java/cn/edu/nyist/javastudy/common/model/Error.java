package cn.edu.nyist.javastudy.common.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	private String title;//标题
	private String errordescri;//错误描述
	private String errorphoto;//错误信息截图
	private String solutiondescri;//解决办法
	private String solutionphoto;//解决办法截图
	public Error() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geterrordescri() {
		return errordescri;
	}
	public void seterrordescri(String errordescri) {
		this.errordescri = errordescri;
	}
	public String geterrorphoto() {
		return errorphoto;
	}
	public void seterrorphoto(String errorphoto) {
		this.errorphoto = errorphoto;
	}
	public String getsolutiondescri() {
		return solutiondescri;
	}
	public void setsolutiondescri(String solutiondescri) {
		this.solutiondescri = solutiondescri;
	}
	public String getsolutionphoto() {
		return solutionphoto;
	}
	public void setsolutionphoto(String solutionphoto) {
		this.solutionphoto = solutionphoto;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
