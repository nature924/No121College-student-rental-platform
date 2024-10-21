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


import com.dao.FangdongDao;
import com.entity.FangdongEntity;
import com.service.FangdongService;
import com.entity.vo.FangdongVO;
import com.entity.view.FangdongView;

@Service("fangdongService")
public class FangdongServiceImpl extends ServiceImpl<FangdongDao, FangdongEntity> implements FangdongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangdongEntity> page = this.selectPage(
                new Query<FangdongEntity>(params).getPage(),
                new EntityWrapper<FangdongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangdongEntity> wrapper) {
		  Page<FangdongView> page =new Query<FangdongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangdongVO> selectListVO(Wrapper<FangdongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangdongVO selectVO(Wrapper<FangdongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangdongView> selectListView(Wrapper<FangdongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangdongView selectView(Wrapper<FangdongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
