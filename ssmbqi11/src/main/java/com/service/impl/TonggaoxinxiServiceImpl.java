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


import com.dao.TonggaoxinxiDao;
import com.entity.TonggaoxinxiEntity;
import com.service.TonggaoxinxiService;
import com.entity.vo.TonggaoxinxiVO;
import com.entity.view.TonggaoxinxiView;

@Service("tonggaoxinxiService")
public class TonggaoxinxiServiceImpl extends ServiceImpl<TonggaoxinxiDao, TonggaoxinxiEntity> implements TonggaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TonggaoxinxiEntity> page = this.selectPage(
                new Query<TonggaoxinxiEntity>(params).getPage(),
                new EntityWrapper<TonggaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TonggaoxinxiEntity> wrapper) {
		  Page<TonggaoxinxiView> page =new Query<TonggaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TonggaoxinxiVO> selectListVO(Wrapper<TonggaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TonggaoxinxiVO selectVO(Wrapper<TonggaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TonggaoxinxiView> selectListView(Wrapper<TonggaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TonggaoxinxiView selectView(Wrapper<TonggaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
