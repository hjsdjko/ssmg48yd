package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaotongzhiyinDao;
import com.entity.JiaotongzhiyinEntity;
import com.service.JiaotongzhiyinService;
import com.entity.vo.JiaotongzhiyinVO;
import com.entity.view.JiaotongzhiyinView;

@Service("jiaotongzhiyinService")
public class JiaotongzhiyinServiceImpl extends ServiceImpl<JiaotongzhiyinDao, JiaotongzhiyinEntity> implements JiaotongzhiyinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaotongzhiyinEntity> page = this.selectPage(
                new Query<JiaotongzhiyinEntity>(params).getPage(),
                new EntityWrapper<JiaotongzhiyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaotongzhiyinEntity> wrapper) {
		  Page<JiaotongzhiyinView> page =new Query<JiaotongzhiyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaotongzhiyinVO> selectListVO(Wrapper<JiaotongzhiyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaotongzhiyinVO selectVO(Wrapper<JiaotongzhiyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaotongzhiyinView> selectListView(Wrapper<JiaotongzhiyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaotongzhiyinView selectView(Wrapper<JiaotongzhiyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
