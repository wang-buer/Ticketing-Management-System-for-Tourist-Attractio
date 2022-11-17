package com.dao;

import com.entity.GoupiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoupiaoxinxiVO;
import com.entity.view.GoupiaoxinxiView;


/**
 * 购票信息
 * 
 * @author 
 * @email 
 * @date 2021-03-03 13:33:00
 */
public interface GoupiaoxinxiDao extends BaseMapper<GoupiaoxinxiEntity> {
	
	List<GoupiaoxinxiVO> selectListVO(@Param("ew") Wrapper<GoupiaoxinxiEntity> wrapper);
	
	GoupiaoxinxiVO selectVO(@Param("ew") Wrapper<GoupiaoxinxiEntity> wrapper);
	
	List<GoupiaoxinxiView> selectListView(@Param("ew") Wrapper<GoupiaoxinxiEntity> wrapper);

	List<GoupiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GoupiaoxinxiEntity> wrapper);
	
	GoupiaoxinxiView selectView(@Param("ew") Wrapper<GoupiaoxinxiEntity> wrapper);
	
}
