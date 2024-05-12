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


import com.dao.XuangoufuzhuangDao;
import com.entity.XuangoufuzhuangEntity;
import com.service.XuangoufuzhuangService;
import com.entity.vo.XuangoufuzhuangVO;
import com.entity.view.XuangoufuzhuangView;

@Service("xuangoufuzhuangService")
public class XuangoufuzhuangServiceImpl extends ServiceImpl<XuangoufuzhuangDao, XuangoufuzhuangEntity> implements XuangoufuzhuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuangoufuzhuangEntity> page = this.selectPage(
                new Query<XuangoufuzhuangEntity>(params).getPage(),
                new EntityWrapper<XuangoufuzhuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuangoufuzhuangEntity> wrapper) {
		  Page<XuangoufuzhuangView> page =new Query<XuangoufuzhuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuangoufuzhuangVO> selectListVO(Wrapper<XuangoufuzhuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuangoufuzhuangVO selectVO(Wrapper<XuangoufuzhuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuangoufuzhuangView> selectListView(Wrapper<XuangoufuzhuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuangoufuzhuangView selectView(Wrapper<XuangoufuzhuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
