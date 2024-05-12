package com.dao;

import com.entity.BaodaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaodaoxinxiVO;
import com.entity.view.BaodaoxinxiView;


/**
 * 报道信息
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface BaodaoxinxiDao extends BaseMapper<BaodaoxinxiEntity> {
	
	List<BaodaoxinxiVO> selectListVO(@Param("ew") Wrapper<BaodaoxinxiEntity> wrapper);
	
	BaodaoxinxiVO selectVO(@Param("ew") Wrapper<BaodaoxinxiEntity> wrapper);
	
	List<BaodaoxinxiView> selectListView(@Param("ew") Wrapper<BaodaoxinxiEntity> wrapper);

	List<BaodaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaodaoxinxiEntity> wrapper);
	
	BaodaoxinxiView selectView(@Param("ew") Wrapper<BaodaoxinxiEntity> wrapper);
	

}
