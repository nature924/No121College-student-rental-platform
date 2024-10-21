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


import com.dao.FangyuanxinxiDao;
import com.entity.FangyuanxinxiEntity;
import com.service.FangyuanxinxiService;
import com.entity.vo.FangyuanxinxiVO;
import com.entity.view.FangyuanxinxiView;

@Service("fangyuanxinxiService")
public class FangyuanxinxiServiceImpl extends ServiceImpl<FangyuanxinxiDao, FangyuanxinxiEntity> implements FangyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyuanxinxiEntity> page = this.selectPage(
                new Query<FangyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<FangyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyuanxinxiEntity> wrapper) {
		  Page<FangyuanxinxiView> page =new Query<FangyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyuanxinxiVO> selectListVO(Wrapper<FangyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyuanxinxiVO selectVO(Wrapper<FangyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyuanxinxiView> selectListView(Wrapper<FangyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyuanxinxiView selectView(Wrapper<FangyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
