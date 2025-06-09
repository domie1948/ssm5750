package com.dao;

import com.entity.YuangongdakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongdakaVO;
import com.entity.view.YuangongdakaView;


/**
 * 员工打卡
 * 
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
public interface YuangongdakaDao extends BaseMapper<YuangongdakaEntity> {
	
	List<YuangongdakaVO> selectListVO(@Param("ew") Wrapper<YuangongdakaEntity> wrapper);
	
	YuangongdakaVO selectVO(@Param("ew") Wrapper<YuangongdakaEntity> wrapper);
	
	List<YuangongdakaView> selectListView(@Param("ew") Wrapper<YuangongdakaEntity> wrapper);

	List<YuangongdakaView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongdakaEntity> wrapper);
	
	YuangongdakaView selectView(@Param("ew") Wrapper<YuangongdakaEntity> wrapper);
	
}
