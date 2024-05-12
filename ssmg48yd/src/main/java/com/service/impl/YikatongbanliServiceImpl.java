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


import com.dao.YikatongbanliDao;
import com.entity.YikatongbanliEntity;
import com.service.YikatongbanliService;
import com.entity.vo.YikatongbanliVO;
import com.entity.view.YikatongbanliView;

@Service("yikatongbanliService")
public class YikatongbanliServiceImpl extends ServiceImpl<YikatongbanliDao, YikatongbanliEntity> implements YikatongbanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YikatongbanliEntity> page = this.selectPage(
                new Query<YikatongbanliEntity>(params).getPage(),
                new EntityWrapper<YikatongbanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YikatongbanliEntity> wrapper) {
		  Page<YikatongbanliView> page =new Query<YikatongbanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YikatongbanliVO> selectListVO(Wrapper<YikatongbanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YikatongbanliVO selectVO(Wrapper<YikatongbanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YikatongbanliView> selectListView(Wrapper<YikatongbanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YikatongbanliView selectView(Wrapper<YikatongbanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
