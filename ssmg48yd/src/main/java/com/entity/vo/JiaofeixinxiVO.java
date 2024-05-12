package com.entity.vo;

import com.entity.JiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 缴费信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public class JiaofeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 报名费
	 */
	
	private Float baomingfei;
		
	/**
	 * 住宿费
	 */
	
	private Float zhusufei;
		
	/**
	 * 书本费
	 */
	
	private Float shubenfei;
		
	/**
	 * 服装费
	 */
	
	private Float fuzhuangfei;
		
	/**
	 * 其他费用
	 */
	
	private Float qitafeiyong;
		
	/**
	 * 总费用
	 */
	
	private Float zongfeiyong;
		
	/**
	 * 备注说明
	 */
	
	private String beizhushuoming;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：报名费
	 */
	 
	public void setBaomingfei(Float baomingfei) {
		this.baomingfei = baomingfei;
	}
	
	/**
	 * 获取：报名费
	 */
	public Float getBaomingfei() {
		return baomingfei;
	}
				
	
	/**
	 * 设置：住宿费
	 */
	 
	public void setZhusufei(Float zhusufei) {
		this.zhusufei = zhusufei;
	}
	
	/**
	 * 获取：住宿费
	 */
	public Float getZhusufei() {
		return zhusufei;
	}
				
	
	/**
	 * 设置：书本费
	 */
	 
	public void setShubenfei(Float shubenfei) {
		this.shubenfei = shubenfei;
	}
	
	/**
	 * 获取：书本费
	 */
	public Float getShubenfei() {
		return shubenfei;
	}
				
	
	/**
	 * 设置：服装费
	 */
	 
	public void setFuzhuangfei(Float fuzhuangfei) {
		this.fuzhuangfei = fuzhuangfei;
	}
	
	/**
	 * 获取：服装费
	 */
	public Float getFuzhuangfei() {
		return fuzhuangfei;
	}
				
	
	/**
	 * 设置：其他费用
	 */
	 
	public void setQitafeiyong(Float qitafeiyong) {
		this.qitafeiyong = qitafeiyong;
	}
	
	/**
	 * 获取：其他费用
	 */
	public Float getQitafeiyong() {
		return qitafeiyong;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(Float zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public Float getZongfeiyong() {
		return zongfeiyong;
	}
				
	
	/**
	 * 设置：备注说明
	 */
	 
	public void setBeizhushuoming(String beizhushuoming) {
		this.beizhushuoming = beizhushuoming;
	}
	
	/**
	 * 获取：备注说明
	 */
	public String getBeizhushuoming() {
		return beizhushuoming;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
