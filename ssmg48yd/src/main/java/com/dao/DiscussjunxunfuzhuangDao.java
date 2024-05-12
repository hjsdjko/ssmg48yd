package com.dao;

import com.entity.DiscussjunxunfuzhuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjunxunfuzhuangVO;
import com.entity.view.DiscussjunxunfuzhuangView;


/**
 * 军训服装评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface DiscussjunxunfuzhuangDao extends BaseMapper<DiscussjunxunfuzhuangEntity> {
	
	List<DiscussjunxunfuzhuangVO> selectListVO(@Param("ew") Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
	
	DiscussjunxunfuzhuangVO selectVO(@Param("ew") Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
	
	List<DiscussjunxunfuzhuangView> selectListView(@Param("ew") Wrapper<DiscussjunxunfuzhuangEntity> wrapper);

	List<DiscussjunxunfuzhuangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
	
	DiscussjunxunfuzhuangView selectView(@Param("ew") Wrapper<DiscussjunxunfuzhuangEntity> wrapper);
	

}
