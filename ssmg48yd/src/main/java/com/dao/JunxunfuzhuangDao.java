package com.dao;

import com.entity.JunxunfuzhuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JunxunfuzhuangVO;
import com.entity.view.JunxunfuzhuangView;


/**
 * 军训服装
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface JunxunfuzhuangDao extends BaseMapper<JunxunfuzhuangEntity> {
	
	List<JunxunfuzhuangVO> selectListVO(@Param("ew") Wrapper<JunxunfuzhuangEntity> wrapper);
	
	JunxunfuzhuangVO selectVO(@Param("ew") Wrapper<JunxunfuzhuangEntity> wrapper);
	
	List<JunxunfuzhuangView> selectListView(@Param("ew") Wrapper<JunxunfuzhuangEntity> wrapper);

	List<JunxunfuzhuangView> selectListView(Pagination page,@Param("ew") Wrapper<JunxunfuzhuangEntity> wrapper);
	
	JunxunfuzhuangView selectView(@Param("ew") Wrapper<JunxunfuzhuangEntity> wrapper);
	

}
