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


import com.dao.JunxunfuzhuangDao;
import com.entity.JunxunfuzhuangEntity;
import com.service.JunxunfuzhuangService;
import com.entity.vo.JunxunfuzhuangVO;
import com.entity.view.JunxunfuzhuangView;

@Service("junxunfuzhuangService")
public class JunxunfuzhuangServiceImpl extends ServiceImpl<JunxunfuzhuangDao, JunxunfuzhuangEntity> implements JunxunfuzhuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JunxunfuzhuangEntity> page = this.selectPage(
                new Query<JunxunfuzhuangEntity>(params).getPage(),
                new EntityWrapper<JunxunfuzhuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JunxunfuzhuangEntity> wrapper) {
		  Page<JunxunfuzhuangView> page =new Query<JunxunfuzhuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JunxunfuzhuangVO> selectListVO(Wrapper<JunxunfuzhuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JunxunfuzhuangVO selectVO(Wrapper<JunxunfuzhuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JunxunfuzhuangView> selectListView(Wrapper<JunxunfuzhuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JunxunfuzhuangView selectView(Wrapper<JunxunfuzhuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
