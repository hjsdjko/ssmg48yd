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


import com.dao.DiscussjunxunfuzhuangDao;
import com.entity.DiscussjunxunfuzhuangEntity;
import com.service.DiscussjunxunfuzhuangService;
import com.entity.vo.DiscussjunxunfuzhuangVO;
import com.entity.view.DiscussjunxunfuzhuangView;

@Service("discussjunxunfuzhuangService")
public class DiscussjunxunfuzhuangServiceImpl extends ServiceImpl<DiscussjunxunfuzhuangDao, DiscussjunxunfuzhuangEntity> implements DiscussjunxunfuzhuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjunxunfuzhuangEntity> page = this.selectPage(
                new Query<DiscussjunxunfuzhuangEntity>(params).getPage(),
                new EntityWrapper<DiscussjunxunfuzhuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjunxunfuzhuangEntity> wrapper) {
		  Page<DiscussjunxunfuzhuangView> page =new Query<DiscussjunxunfuzhuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjunxunfuzhuangVO> selectListVO(Wrapper<DiscussjunxunfuzhuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjunxunfuzhuangVO selectVO(Wrapper<DiscussjunxunfuzhuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjunxunfuzhuangView> selectListView(Wrapper<DiscussjunxunfuzhuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjunxunfuzhuangView selectView(Wrapper<DiscussjunxunfuzhuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
