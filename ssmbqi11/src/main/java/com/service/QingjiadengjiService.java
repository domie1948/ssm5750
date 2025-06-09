package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QingjiadengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QingjiadengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjiadengjiView;


/**
 * 请假登记
 *
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
public interface QingjiadengjiService extends IService<QingjiadengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QingjiadengjiVO> selectListVO(Wrapper<QingjiadengjiEntity> wrapper);
   	
   	QingjiadengjiVO selectVO(@Param("ew") Wrapper<QingjiadengjiEntity> wrapper);
   	
   	List<QingjiadengjiView> selectListView(Wrapper<QingjiadengjiEntity> wrapper);
   	
   	QingjiadengjiView selectView(@Param("ew") Wrapper<QingjiadengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QingjiadengjiEntity> wrapper);
   	
}

