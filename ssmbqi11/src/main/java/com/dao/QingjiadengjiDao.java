package com.dao;

import com.entity.QingjiadengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QingjiadengjiVO;
import com.entity.view.QingjiadengjiView;


/**
 * 请假登记
 * 
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
public interface QingjiadengjiDao extends BaseMapper<QingjiadengjiEntity> {
	
	List<QingjiadengjiVO> selectListVO(@Param("ew") Wrapper<QingjiadengjiEntity> wrapper);
	
	QingjiadengjiVO selectVO(@Param("ew") Wrapper<QingjiadengjiEntity> wrapper);
	
	List<QingjiadengjiView> selectListView(@Param("ew") Wrapper<QingjiadengjiEntity> wrapper);

	List<QingjiadengjiView> selectListView(Pagination page,@Param("ew") Wrapper<QingjiadengjiEntity> wrapper);
	
	QingjiadengjiView selectView(@Param("ew") Wrapper<QingjiadengjiEntity> wrapper);
	
}
