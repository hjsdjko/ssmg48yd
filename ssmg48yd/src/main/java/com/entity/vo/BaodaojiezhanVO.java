package com.entity.vo;

import com.entity.BaodaojiezhanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 报道接站
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public class BaodaojiezhanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 站点地址
	 */
	
	private String zhandiandizhi;
		
	/**
	 * 报道流程
	 */
	
	private String baodaoliucheng;
				
	
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：站点地址
	 */
	 
	public void setZhandiandizhi(String zhandiandizhi) {
		this.zhandiandizhi = zhandiandizhi;
	}
	
	/**
	 * 获取：站点地址
	 */
	public String getZhandiandizhi() {
		return zhandiandizhi;
	}
				
	
	/**
	 * 设置：报道流程
	 */
	 
	public void setBaodaoliucheng(String baodaoliucheng) {
		this.baodaoliucheng = baodaoliucheng;
	}
	
	/**
	 * 获取：报道流程
	 */
	public String getBaodaoliucheng() {
		return baodaoliucheng;
	}
			
}
