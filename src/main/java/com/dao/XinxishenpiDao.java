package com.dao;

import com.entity.XinxishenpiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinxishenpiVO;
import com.entity.view.XinxishenpiView;


/**
 * 信息审批
 * 
 * @author 
 * @email 
 * @date 2021-04-22 15:05:37
 */
public interface XinxishenpiDao extends BaseMapper<XinxishenpiEntity> {
	
	List<XinxishenpiVO> selectListVO(@Param("ew") Wrapper<XinxishenpiEntity> wrapper);
	
	XinxishenpiVO selectVO(@Param("ew") Wrapper<XinxishenpiEntity> wrapper);
	
	List<XinxishenpiView> selectListView(@Param("ew") Wrapper<XinxishenpiEntity> wrapper);

	List<XinxishenpiView> selectListView(Pagination page,@Param("ew") Wrapper<XinxishenpiEntity> wrapper);
	
	XinxishenpiView selectView(@Param("ew") Wrapper<XinxishenpiEntity> wrapper);
	
}
