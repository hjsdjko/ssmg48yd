package com.entity.view;

import com.entity.XuangoufuzhuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 选购服装
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
@TableName("xuangoufuzhuang")
public class XuangoufuzhuangView  extends XuangoufuzhuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuangoufuzhuangView(){
	}
 
 	public XuangoufuzhuangView(XuangoufuzhuangEntity xuangoufuzhuangEntity){
 	try {
			BeanUtils.copyProperties(this, xuangoufuzhuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
