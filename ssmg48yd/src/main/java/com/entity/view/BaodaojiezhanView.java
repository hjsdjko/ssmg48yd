package com.entity.view;

import com.entity.BaodaojiezhanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报道接站
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
@TableName("baodaojiezhan")
public class BaodaojiezhanView  extends BaodaojiezhanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaodaojiezhanView(){
	}
 
 	public BaodaojiezhanView(BaodaojiezhanEntity baodaojiezhanEntity){
 	try {
			BeanUtils.copyProperties(this, baodaojiezhanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
