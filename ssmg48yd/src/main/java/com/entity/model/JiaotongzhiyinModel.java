package com.entity.model;

import com.entity.JiaotongzhiyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 交通指引
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public class JiaotongzhiyinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
