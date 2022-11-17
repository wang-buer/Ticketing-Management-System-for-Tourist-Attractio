package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoupiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoupiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoupiaoxinxiView;


/**
 * 购票信息
 *
 * @author 
 * @email 
 * @date 2021-03-03 13:33:00
 */
public interface GoupiaoxinxiService extends IService<GoupiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoupiaoxinxiVO> selectListVO(Wrapper<GoupiaoxinxiEntity> wrapper);
   	
   	GoupiaoxinxiVO selectVO(@Param("ew") Wrapper<GoupiaoxinxiEntity> wrapper);
   	
   	List<GoupiaoxinxiView> selectListView(Wrapper<GoupiaoxinxiEntity> wrapper);
   	
   	GoupiaoxinxiView selectView(@Param("ew") Wrapper<GoupiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoupiaoxinxiEntity> wrapper);
   	
}

