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

import com.entity.BaodaoxinxiEntity;
import com.entity.view.BaodaoxinxiView;

import com.service.BaodaoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 报道信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-26 22:00:28
 */
@RestController
@RequestMapping("/baodaoxinxi")
public class BaodaoxinxiController {
    @Autowired
    private BaodaoxinxiService baodaoxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaodaoxinxiEntity baodaoxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			baodaoxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaodaoxinxiEntity> ew = new EntityWrapper<BaodaoxinxiEntity>();
		PageUtils page = baodaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baodaoxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaodaoxinxiEntity baodaoxinxi, 
		HttpServletRequest request){
        EntityWrapper<BaodaoxinxiEntity> ew = new EntityWrapper<BaodaoxinxiEntity>();
		PageUtils page = baodaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baodaoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaodaoxinxiEntity baodaoxinxi){
       	EntityWrapper<BaodaoxinxiEntity> ew = new EntityWrapper<BaodaoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baodaoxinxi, "baodaoxinxi")); 
        return R.ok().put("data", baodaoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaodaoxinxiEntity baodaoxinxi){
        EntityWrapper< BaodaoxinxiEntity> ew = new EntityWrapper< BaodaoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baodaoxinxi, "baodaoxinxi")); 
		BaodaoxinxiView baodaoxinxiView =  baodaoxinxiService.selectView(ew);
		return R.ok("查询报道信息成功").put("data", baodaoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaodaoxinxiEntity baodaoxinxi = baodaoxinxiService.selectById(id);
        return R.ok().put("data", baodaoxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaodaoxinxiEntity baodaoxinxi = baodaoxinxiService.selectById(id);
        return R.ok().put("data", baodaoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaodaoxinxiEntity baodaoxinxi, HttpServletRequest request){
    	baodaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baodaoxinxi);

        baodaoxinxiService.insert(baodaoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaodaoxinxiEntity baodaoxinxi, HttpServletRequest request){
    	baodaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baodaoxinxi);

        baodaoxinxiService.insert(baodaoxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BaodaoxinxiEntity baodaoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baodaoxinxi);
        baodaoxinxiService.updateById(baodaoxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baodaoxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BaodaoxinxiEntity> wrapper = new EntityWrapper<BaodaoxinxiEntity>();
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

		int count = baodaoxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
