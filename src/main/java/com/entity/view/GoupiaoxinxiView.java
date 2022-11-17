package com.entity.view;

import com.entity.GoupiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 购票信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 13:33:00
 */
@TableName("goupiaoxinxi")
public class GoupiaoxinxiView  extends GoupiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoupiaoxinxiView(){
	}
 
 	public GoupiaoxinxiView(GoupiaoxinxiEntity goupiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, goupiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
