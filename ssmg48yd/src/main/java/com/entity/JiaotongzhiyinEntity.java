package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 交通指引
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
@TableName("jiaotongzhiyin")
public class JiaotongzhiyinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaotongzhiyinEntity() {
		
	}
	
	public JiaotongzhiyinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学校名称
	 */
					
	private String xuexiaomingcheng;
	
	/**
	 * 学校位置
	 */
					
	private String xuexiaoweizhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 路过公交
	 */
					
	private String luguogongjiao;
	
	/**
	 * 附近建筑
	 */
					
	private String fujinjianzhu;
	
	/**
	 * 交通指南
	 */
					
	private String jiaotongzhinan;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学校名称
	 */
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
	}
	/**
	 * 设置：学校位置
	 */
	public void setXuexiaoweizhi(String xuexiaoweizhi) {
		this.xuexiaoweizhi = xuexiaoweizhi;
	}
	/**
	 * 获取：学校位置
	 */
	public String getXuexiaoweizhi() {
		return xuexiaoweizhi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：路过公交
	 */
	public void setLuguogongjiao(String luguogongjiao) {
		this.luguogongjiao = luguogongjiao;
	}
	/**
	 * 获取：路过公交
	 */
	public String getLuguogongjiao() {
		return luguogongjiao;
	}
	/**
	 * 设置：附近建筑
	 */
	public void setFujinjianzhu(String fujinjianzhu) {
		this.fujinjianzhu = fujinjianzhu;
	}
	/**
	 * 获取：附近建筑
	 */
	public String getFujinjianzhu() {
		return fujinjianzhu;
	}
	/**
	 * 设置：交通指南
	 */
	public void setJiaotongzhinan(String jiaotongzhinan) {
		this.jiaotongzhinan = jiaotongzhinan;
	}
	/**
	 * 获取：交通指南
	 */
	public String getJiaotongzhinan() {
		return jiaotongzhinan;
	}

}
