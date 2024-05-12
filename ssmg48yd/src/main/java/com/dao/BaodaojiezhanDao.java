package com.dao;

import com.entity.BaodaojiezhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaodaojiezhanVO;
import com.entity.view.BaodaojiezhanView;


/**
 * 报道接站
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface BaodaojiezhanDao extends BaseMapper<BaodaojiezhanEntity> {
	
	List<BaodaojiezhanVO> selectListVO(@Param("ew") Wrapper<BaodaojiezhanEntity> wrapper);
	
	BaodaojiezhanVO selectVO(@Param("ew") Wrapper<BaodaojiezhanEntity> wrapper);
	
	List<BaodaojiezhanView> selectListView(@Param("ew") Wrapper<BaodaojiezhanEntity> wrapper);

	List<BaodaojiezhanView> selectListView(Pagination page,@Param("ew") Wrapper<BaodaojiezhanEntity> wrapper);
	
	BaodaojiezhanView selectView(@Param("ew") Wrapper<BaodaojiezhanEntity> wrapper);
	

}
