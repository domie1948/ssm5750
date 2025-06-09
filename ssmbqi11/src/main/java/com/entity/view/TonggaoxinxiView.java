package com.entity.view;

import com.entity.TonggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 通告信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
@TableName("tonggaoxinxi")
public class TonggaoxinxiView  extends TonggaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TonggaoxinxiView(){
	}
 
 	public TonggaoxinxiView(TonggaoxinxiEntity tonggaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tonggaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
