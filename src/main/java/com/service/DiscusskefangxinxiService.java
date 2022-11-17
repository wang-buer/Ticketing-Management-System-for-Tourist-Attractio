package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskefangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskefangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskefangxinxiView;


/**
 * 客房信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-03 13:33:01
 */
public interface DiscusskefangxinxiService extends IService<DiscusskefangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskefangxinxiVO> selectListVO(Wrapper<DiscusskefangxinxiEntity> wrapper);
   	
   	DiscusskefangxinxiVO selectVO(@Param("ew") Wrapper<DiscusskefangxinxiEntity> wrapper);
   	
   	List<DiscusskefangxinxiView> selectListView(Wrapper<DiscusskefangxinxiEntity> wrapper);
   	
   	DiscusskefangxinxiView selectView(@Param("ew") Wrapper<DiscusskefangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskefangxinxiEntity> wrapper);
   	
}

