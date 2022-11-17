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


import com.dao.DiscusskefangxinxiDao;
import com.entity.DiscusskefangxinxiEntity;
import com.service.DiscusskefangxinxiService;
import com.entity.vo.DiscusskefangxinxiVO;
import com.entity.view.DiscusskefangxinxiView;

@Service("discusskefangxinxiService")
public class DiscusskefangxinxiServiceImpl extends ServiceImpl<DiscusskefangxinxiDao, DiscusskefangxinxiEntity> implements DiscusskefangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskefangxinxiEntity> page = this.selectPage(
                new Query<DiscusskefangxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusskefangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskefangxinxiEntity> wrapper) {
		  Page<DiscusskefangxinxiView> page =new Query<DiscusskefangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskefangxinxiVO> selectListVO(Wrapper<DiscusskefangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskefangxinxiVO selectVO(Wrapper<DiscusskefangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskefangxinxiView> selectListView(Wrapper<DiscusskefangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskefangxinxiView selectView(Wrapper<DiscusskefangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
