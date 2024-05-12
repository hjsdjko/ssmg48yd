package com.entity.view;

import com.entity.YikatongbanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 一卡通办理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
@TableName("yikatongbanli")
public class YikatongbanliView  extends YikatongbanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YikatongbanliView(){
	}
 
 	public YikatongbanliView(YikatongbanliEntity yikatongbanliEntity){
 	try {
			BeanUtils.copyProperties(this, yikatongbanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
