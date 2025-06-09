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


import com.dao.HuiyijiluDao;
import com.entity.HuiyijiluEntity;
import com.service.HuiyijiluService;
import com.entity.vo.HuiyijiluVO;
import com.entity.view.HuiyijiluView;

@Service("huiyijiluService")
public class HuiyijiluServiceImpl extends ServiceImpl<HuiyijiluDao, HuiyijiluEntity> implements HuiyijiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyijiluEntity> page = this.selectPage(
                new Query<HuiyijiluEntity>(params).getPage(),
                new EntityWrapper<HuiyijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyijiluEntity> wrapper) {
		  Page<HuiyijiluView> page =new Query<HuiyijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyijiluVO> selectListVO(Wrapper<HuiyijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyijiluVO selectVO(Wrapper<HuiyijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyijiluView> selectListView(Wrapper<HuiyijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyijiluView selectView(Wrapper<HuiyijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
