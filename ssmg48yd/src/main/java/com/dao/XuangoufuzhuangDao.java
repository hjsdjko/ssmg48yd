package com.dao;

import com.entity.XuangoufuzhuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuangoufuzhuangVO;
import com.entity.view.XuangoufuzhuangView;


/**
 * 选购服装
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface XuangoufuzhuangDao extends BaseMapper<XuangoufuzhuangEntity> {
	
	List<XuangoufuzhuangVO> selectListVO(@Param("ew") Wrapper<XuangoufuzhuangEntity> wrapper);
	
	XuangoufuzhuangVO selectVO(@Param("ew") Wrapper<XuangoufuzhuangEntity> wrapper);
	
	List<XuangoufuzhuangView> selectListView(@Param("ew") Wrapper<XuangoufuzhuangEntity> wrapper);

	List<XuangoufuzhuangView> selectListView(Pagination page,@Param("ew") Wrapper<XuangoufuzhuangEntity> wrapper);
	
	XuangoufuzhuangView selectView(@Param("ew") Wrapper<XuangoufuzhuangEntity> wrapper);
	

}
