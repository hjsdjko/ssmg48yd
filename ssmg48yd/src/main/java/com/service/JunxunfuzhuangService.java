package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JunxunfuzhuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JunxunfuzhuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JunxunfuzhuangView;


/**
 * 军训服装
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface JunxunfuzhuangService extends IService<JunxunfuzhuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JunxunfuzhuangVO> selectListVO(Wrapper<JunxunfuzhuangEntity> wrapper);
   	
   	JunxunfuzhuangVO selectVO(@Param("ew") Wrapper<JunxunfuzhuangEntity> wrapper);
   	
   	List<JunxunfuzhuangView> selectListView(Wrapper<JunxunfuzhuangEntity> wrapper);
   	
   	JunxunfuzhuangView selectView(@Param("ew") Wrapper<JunxunfuzhuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JunxunfuzhuangEntity> wrapper);
   	

}

