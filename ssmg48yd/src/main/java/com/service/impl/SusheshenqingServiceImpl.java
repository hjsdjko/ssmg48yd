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


import com.dao.SusheshenqingDao;
import com.entity.SusheshenqingEntity;
import com.service.SusheshenqingService;
import com.entity.vo.SusheshenqingVO;
import com.entity.view.SusheshenqingView;

@Service("susheshenqingService")
public class SusheshenqingServiceImpl extends ServiceImpl<SusheshenqingDao, SusheshenqingEntity> implements SusheshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusheshenqingEntity> page = this.selectPage(
                new Query<SusheshenqingEntity>(params).getPage(),
                new EntityWrapper<SusheshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusheshenqingEntity> wrapper) {
		  Page<SusheshenqingView> page =new Query<SusheshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusheshenqingVO> selectListVO(Wrapper<SusheshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusheshenqingVO selectVO(Wrapper<SusheshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusheshenqingView> selectListView(Wrapper<SusheshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusheshenqingView selectView(Wrapper<SusheshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
