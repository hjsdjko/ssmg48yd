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


import com.dao.BaodaojiezhanDao;
import com.entity.BaodaojiezhanEntity;
import com.service.BaodaojiezhanService;
import com.entity.vo.BaodaojiezhanVO;
import com.entity.view.BaodaojiezhanView;

@Service("baodaojiezhanService")
public class BaodaojiezhanServiceImpl extends ServiceImpl<BaodaojiezhanDao, BaodaojiezhanEntity> implements BaodaojiezhanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaodaojiezhanEntity> page = this.selectPage(
                new Query<BaodaojiezhanEntity>(params).getPage(),
                new EntityWrapper<BaodaojiezhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaodaojiezhanEntity> wrapper) {
		  Page<BaodaojiezhanView> page =new Query<BaodaojiezhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaodaojiezhanVO> selectListVO(Wrapper<BaodaojiezhanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaodaojiezhanVO selectVO(Wrapper<BaodaojiezhanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaodaojiezhanView> selectListView(Wrapper<BaodaojiezhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaodaojiezhanView selectView(Wrapper<BaodaojiezhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
