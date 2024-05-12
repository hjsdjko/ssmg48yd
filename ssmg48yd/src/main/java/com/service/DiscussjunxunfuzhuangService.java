package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjunxunfuzhuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjunxunfuzhuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjunxunfuzhuangView;


/**
 * 军训服装评论表
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface DiscussjunxunfuzhuangService extends IService<DiscussjunxunfuzhuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjunxunfuzhuangVO> selectListVO(Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
   	
   	DiscussjunxunfuzhuangVO selectVO(@Param("ew") Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
   	
   	List<DiscussjunxunfuzhuangView> selectListView(Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
   	
   	DiscussjunxunfuzhuangView selectView(@Param("ew") Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
   	

}

