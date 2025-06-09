package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TonggaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TonggaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TonggaoxinxiView;


/**
 * 通告信息
 *
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
public interface TonggaoxinxiService extends IService<TonggaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TonggaoxinxiVO> selectListVO(Wrapper<TonggaoxinxiEntity> wrapper);
   	
   	TonggaoxinxiVO selectVO(@Param("ew") Wrapper<TonggaoxinxiEntity> wrapper);
   	
   	List<TonggaoxinxiView> selectListView(Wrapper<TonggaoxinxiEntity> wrapper);
   	
   	TonggaoxinxiView selectView(@Param("ew") Wrapper<TonggaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TonggaoxinxiEntity> wrapper);
   	
}

