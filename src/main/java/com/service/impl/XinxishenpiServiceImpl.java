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


import com.dao.XinxishenpiDao;
import com.entity.XinxishenpiEntity;
import com.service.XinxishenpiService;
import com.entity.vo.XinxishenpiVO;
import com.entity.view.XinxishenpiView;

@Service("xinxishenpiService")
public class XinxishenpiServiceImpl extends ServiceImpl<XinxishenpiDao, XinxishenpiEntity> implements XinxishenpiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinxishenpiEntity> page = this.selectPage(
                new Query<XinxishenpiEntity>(params).getPage(),
                new EntityWrapper<XinxishenpiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinxishenpiEntity> wrapper) {
		  Page<XinxishenpiView> page =new Query<XinxishenpiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinxishenpiVO> selectListVO(Wrapper<XinxishenpiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinxishenpiVO selectVO(Wrapper<XinxishenpiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinxishenpiView> selectListView(Wrapper<XinxishenpiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinxishenpiView selectView(Wrapper<XinxishenpiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
