package com.entity.model;

import com.entity.JunxunfuzhuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 军训服装
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public class JunxunfuzhuangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 服装颜色
	 */
	
	private String fuzhuangyanse;
		
	/**
	 * 服装材料
	 */
	
	private String fuzhuangcailiao;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 服装详情
	 */
	
	private String fuzhuangxiangqing;
				
	
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
	 * 设置：服装颜色
	 */
	 
	public void setFuzhuangyanse(String fuzhuangyanse) {
		this.fuzhuangyanse = fuzhuangyanse;
	}
	
	/**
	 * 获取：服装颜色
	 */
	public String getFuzhuangyanse() {
		return fuzhuangyanse;
	}
				
	
	/**
	 * 设置：服装材料
	 */
	 
	public void setFuzhuangcailiao(String fuzhuangcailiao) {
		this.fuzhuangcailiao = fuzhuangcailiao;
	}
	
	/**
	 * 获取：服装材料
	 */
	public String getFuzhuangcailiao() {
		return fuzhuangcailiao;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：服装详情
	 */
	 
	public void setFuzhuangxiangqing(String fuzhuangxiangqing) {
		this.fuzhuangxiangqing = fuzhuangxiangqing;
	}
	
	/**
	 * 获取：服装详情
	 */
	public String getFuzhuangxiangqing() {
		return fuzhuangxiangqing;
	}
			
}
