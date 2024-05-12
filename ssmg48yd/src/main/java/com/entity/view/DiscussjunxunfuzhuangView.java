package com.entity.view;

import com.entity.DiscussjunxunfuzhuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 军训服装评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
@TableName("discussjunxunfuzhuang")
public class DiscussjunxunfuzhuangView  extends DiscussjunxunfuzhuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjunxunfuzhuangView(){
	}
 
 	public DiscussjunxunfuzhuangView(DiscussjunxunfuzhuangEntity discussjunxunfuzhuangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjunxunfuzhuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
