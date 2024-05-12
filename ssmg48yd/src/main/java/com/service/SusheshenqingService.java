package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusheshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusheshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheshenqingView;


/**
 * 宿舍申请
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface SusheshenqingService extends IService<SusheshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusheshenqingVO> selectListVO(Wrapper<SusheshenqingEntity> wrapper);
   	
   	SusheshenqingVO selectVO(@Param("ew") Wrapper<SusheshenqingEntity> wrapper);
   	
   	List<SusheshenqingView> selectListView(Wrapper<SusheshenqingEntity> wrapper);
   	
   	SusheshenqingView selectView(@Param("ew") Wrapper<SusheshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusheshenqingEntity> wrapper);
   	

}

