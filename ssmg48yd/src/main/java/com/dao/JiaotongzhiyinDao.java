package com.dao;

import com.entity.JiaotongzhiyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaotongzhiyinVO;
import com.entity.view.JiaotongzhiyinView;


/**
 * 交通指引
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
public interface JiaotongzhiyinDao extends BaseMapper<JiaotongzhiyinEntity> {
	
	List<JiaotongzhiyinVO> selectListVO(@Param("ew") Wrapper<JiaotongzhiyinEntity> wrapper);
	
	JiaotongzhiyinVO selectVO(@Param("ew") Wrapper<JiaotongzhiyinEntity> wrapper);
	
	List<JiaotongzhiyinView> selectListView(@Param("ew") Wrapper<JiaotongzhiyinEntity> wrapper);

	List<JiaotongzhiyinView> selectListView(Pagination page,@Param("ew") Wrapper<JiaotongzhiyinEntity> wrapper);
	
	JiaotongzhiyinView selectView(@Param("ew") Wrapper<JiaotongzhiyinEntity> wrapper);
	

}
