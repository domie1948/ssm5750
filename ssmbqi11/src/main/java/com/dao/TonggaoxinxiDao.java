package com.dao;

import com.entity.TonggaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TonggaoxinxiVO;
import com.entity.view.TonggaoxinxiView;


/**
 * 通告信息
 * 
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
public interface TonggaoxinxiDao extends BaseMapper<TonggaoxinxiEntity> {
	
	List<TonggaoxinxiVO> selectListVO(@Param("ew") Wrapper<TonggaoxinxiEntity> wrapper);
	
	TonggaoxinxiVO selectVO(@Param("ew") Wrapper<TonggaoxinxiEntity> wrapper);
	
	List<TonggaoxinxiView> selectListView(@Param("ew") Wrapper<TonggaoxinxiEntity> wrapper);

	List<TonggaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TonggaoxinxiEntity> wrapper);
	
	TonggaoxinxiView selectView(@Param("ew") Wrapper<TonggaoxinxiEntity> wrapper);
	
}
