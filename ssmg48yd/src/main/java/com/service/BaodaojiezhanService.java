package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaodaojiezhanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaodaojiezhanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaodaojiezhanView;


/**
 * 报道接站
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface BaodaojiezhanService extends IService<BaodaojiezhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaodaojiezhanVO> selectListVO(Wrapper<BaodaojiezhanEntity> wrapper);
   	
   	BaodaojiezhanVO selectVO(@Param("ew") Wrapper<BaodaojiezhanEntity> wrapper);
   	
   	List<BaodaojiezhanView> selectListView(Wrapper<BaodaojiezhanEntity> wrapper);
   	
   	BaodaojiezhanView selectView(@Param("ew") Wrapper<BaodaojiezhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaodaojiezhanEntity> wrapper);
   	

}

