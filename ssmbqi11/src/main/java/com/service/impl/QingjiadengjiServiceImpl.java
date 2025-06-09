package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QingjiadengjiDao;
import com.entity.QingjiadengjiEntity;
import com.service.QingjiadengjiService;
import com.entity.vo.QingjiadengjiVO;
import com.entity.view.QingjiadengjiView;

@Service("qingjiadengjiService")
public class QingjiadengjiServiceImpl extends ServiceImpl<QingjiadengjiDao, QingjiadengjiEntity> implements QingjiadengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QingjiadengjiEntity> page = this.selectPage(
                new Query<QingjiadengjiEntity>(params).getPage(),
                new EntityWrapper<QingjiadengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QingjiadengjiEntity> wrapper) {
		  Page<QingjiadengjiView> page =new Query<QingjiadengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QingjiadengjiVO> selectListVO(Wrapper<QingjiadengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QingjiadengjiVO selectVO(Wrapper<QingjiadengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QingjiadengjiView> selectListView(Wrapper<QingjiadengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QingjiadengjiView selectView(Wrapper<QingjiadengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
