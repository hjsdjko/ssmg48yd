package com.entity.view;

import com.entity.SusheshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
@TableName("susheshenqing")
public class SusheshenqingView  extends SusheshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SusheshenqingView(){
	}
 
 	public SusheshenqingView(SusheshenqingEntity susheshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, susheshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
