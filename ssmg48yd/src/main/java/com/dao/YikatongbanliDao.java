package com.dao;

import com.entity.YikatongbanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YikatongbanliVO;
import com.entity.view.YikatongbanliView;


/**
 * 一卡通办理
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface YikatongbanliDao extends BaseMapper<YikatongbanliEntity> {
	
	List<YikatongbanliVO> selectListVO(@Param("ew") Wrapper<YikatongbanliEntity> wrapper);
	
	YikatongbanliVO selectVO(@Param("ew") Wrapper<YikatongbanliEntity> wrapper);
	
	List<YikatongbanliView> selectListView(@Param("ew") Wrapper<YikatongbanliEntity> wrapper);

	List<YikatongbanliView> selectListView(Pagination page,@Param("ew") Wrapper<YikatongbanliEntity> wrapper);
	
	YikatongbanliView selectView(@Param("ew") Wrapper<YikatongbanliEntity> wrapper);
	

}
