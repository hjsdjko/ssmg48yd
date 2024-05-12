package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YikatongbanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YikatongbanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YikatongbanliView;


/**
 * 一卡通办理
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface YikatongbanliService extends IService<YikatongbanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YikatongbanliVO> selectListVO(Wrapper<YikatongbanliEntity> wrapper);
   	
   	YikatongbanliVO selectVO(@Param("ew") Wrapper<YikatongbanliEntity> wrapper);
   	
   	List<YikatongbanliView> selectListView(Wrapper<YikatongbanliEntity> wrapper);
   	
   	YikatongbanliView selectView(@Param("ew") Wrapper<YikatongbanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YikatongbanliEntity> wrapper);
   	

}

