package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SusheshenqingEntity;
import com.entity.view.SusheshenqingView;

import com.service.SusheshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 宿舍申请
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
@RestController
@RequestMapping("/susheshenqing")
public class SusheshenqingController {
    @Autowired
    private SusheshenqingService susheshenqingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SusheshenqingEntity susheshenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			susheshenqing.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SusheshenqingEntity> ew = new EntityWrapper<SusheshenqingEntity>();
		PageUtils page = susheshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, susheshenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SusheshenqingEntity susheshenqing, 
		HttpServletRequest request){
        EntityWrapper<SusheshenqingEntity> ew = new EntityWrapper<SusheshenqingEntity>();
		PageUtils page = susheshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, susheshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SusheshenqingEntity susheshenqing){
       	EntityWrapper<SusheshenqingEntity> ew = new EntityWrapper<SusheshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( susheshenqing, "susheshenqing")); 
        return R.ok().put("data", susheshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SusheshenqingEntity susheshenqing){
        EntityWrapper< SusheshenqingEntity> ew = new EntityWrapper< SusheshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( susheshenqing, "susheshenqing")); 
		SusheshenqingView susheshenqingView =  susheshenqingService.selectView(ew);
		return R.ok("查询宿舍申请成功").put("data", susheshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SusheshenqingEntity susheshenqing = susheshenqingService.selectById(id);
        return R.ok().put("data", susheshenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SusheshenqingEntity susheshenqing = susheshenqingService.selectById(id);
        return R.ok().put("data", susheshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SusheshenqingEntity susheshenqing, HttpServletRequest request){
    	susheshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(susheshenqing);

        susheshenqingService.insert(susheshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SusheshenqingEntity susheshenqing, HttpServletRequest request){
    	susheshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(susheshenqing);

        susheshenqingService.insert(susheshenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SusheshenqingEntity susheshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(susheshenqing);
        susheshenqingService.updateById(susheshenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        susheshenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SusheshenqingEntity> wrapper = new EntityWrapper<SusheshenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = susheshenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
