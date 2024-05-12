package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaotongzhiyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaotongzhiyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaotongzhiyinView;


/**
 * 交通指引
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface JiaotongzhiyinService extends IService<JiaotongzhiyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaotongzhiyinVO> selectListVO(Wrapper<JiaotongzhiyinEntity> wrapper);
   	
   	JiaotongzhiyinVO selectVO(@Param("ew") Wrapper<JiaotongzhiyinEntity> wrapper);
   	
   	List<JiaotongzhiyinView> selectListView(Wrapper<JiaotongzhiyinEntity> wrapper);
   	
   	JiaotongzhiyinView selectView(@Param("ew") Wrapper<JiaotongzhiyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaotongzhiyinEntity> wrapper);
   	

}

