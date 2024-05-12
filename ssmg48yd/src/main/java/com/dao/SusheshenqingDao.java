package com.dao;

import com.entity.SusheshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusheshenqingVO;
import com.entity.view.SusheshenqingView;


/**
 * 宿舍申请
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface SusheshenqingDao extends BaseMapper<SusheshenqingEntity> {
	
	List<SusheshenqingVO> selectListVO(@Param("ew") Wrapper<SusheshenqingEntity> wrapper);
	
	SusheshenqingVO selectVO(@Param("ew") Wrapper<SusheshenqingEntity> wrapper);
	
	List<SusheshenqingView> selectListView(@Param("ew") Wrapper<SusheshenqingEntity> wrapper);

	List<SusheshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<SusheshenqingEntity> wrapper);
	
	SusheshenqingView selectView(@Param("ew") Wrapper<SusheshenqingEntity> wrapper);
	

}
