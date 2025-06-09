package com.entity.view;

import com.entity.HuiyijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会议记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
@TableName("huiyijilu")
public class HuiyijiluView  extends HuiyijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyijiluView(){
	}
 
 	public HuiyijiluView(HuiyijiluEntity huiyijiluEntity){
 	try {
			BeanUtils.copyProperties(this, huiyijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
