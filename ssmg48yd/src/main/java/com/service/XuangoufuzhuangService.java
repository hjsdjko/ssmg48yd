package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuangoufuzhuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuangoufuzhuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuangoufuzhuangView;


/**
 * 选购服装
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface XuangoufuzhuangService extends IService<XuangoufuzhuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuangoufuzhuangVO> selectListVO(Wrapper<XuangoufuzhuangEntity> wrapper);
   	
   	XuangoufuzhuangVO selectVO(@Param("ew") Wrapper<XuangoufuzhuangEntity> wrapper);
   	
   	List<XuangoufuzhuangView> selectListView(Wrapper<XuangoufuzhuangEntity> wrapper);
   	
   	XuangoufuzhuangView selectView(@Param("ew") Wrapper<XuangoufuzhuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuangoufuzhuangEntity> wrapper);
   	

}

