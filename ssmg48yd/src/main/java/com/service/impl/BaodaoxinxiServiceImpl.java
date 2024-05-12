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


import com.dao.BaodaoxinxiDao;
import com.entity.BaodaoxinxiEntity;
import com.service.BaodaoxinxiService;
import com.entity.vo.BaodaoxinxiVO;
import com.entity.view.BaodaoxinxiView;

@Service("baodaoxinxiService")
public class BaodaoxinxiServiceImpl extends ServiceImpl<BaodaoxinxiDao, BaodaoxinxiEntity> implements BaodaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaodaoxinxiEntity> page = this.selectPage(
                new Query<BaodaoxinxiEntity>(params).getPage(),
                new EntityWrapper<BaodaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaodaoxinxiEntity> wrapper) {
		  Page<BaodaoxinxiView> page =new Query<BaodaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaodaoxinxiVO> selectListVO(Wrapper<BaodaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaodaoxinxiVO selectVO(Wrapper<BaodaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaodaoxinxiView> selectListView(Wrapper<BaodaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaodaoxinxiView selectView(Wrapper<BaodaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
