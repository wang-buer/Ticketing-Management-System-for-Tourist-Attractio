package com.dao;

import com.entity.KefangleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangleixingVO;
import com.entity.view.KefangleixingView;


/**
 * 客房类型
 * 
 * @author 
 * @email 
 * @date 2021-03-03 13:33:00
 */
public interface KefangleixingDao extends BaseMapper<KefangleixingEntity> {
	
	List<KefangleixingVO> selectListVO(@Param("ew") Wrapper<KefangleixingEntity> wrapper);
	
	KefangleixingVO selectVO(@Param("ew") Wrapper<KefangleixingEntity> wrapper);
	
	List<KefangleixingView> selectListView(@Param("ew") Wrapper<KefangleixingEntity> wrapper);

	List<KefangleixingView> selectListView(Pagination page,@Param("ew") Wrapper<KefangleixingEntity> wrapper);
	
	KefangleixingView selectView(@Param("ew") Wrapper<KefangleixingEntity> wrapper);
	
}
