package com.entity.view;

import com.entity.QingjiadengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 请假登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
@TableName("qingjiadengji")
public class QingjiadengjiView  extends QingjiadengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QingjiadengjiView(){
	}
 
 	public QingjiadengjiView(QingjiadengjiEntity qingjiadengjiEntity){
 	try {
			BeanUtils.copyProperties(this, qingjiadengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
