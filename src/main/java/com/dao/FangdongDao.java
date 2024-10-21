package com.dao;

import com.entity.FangdongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangdongVO;
import com.entity.view.FangdongView;


/**
 * 房东
 * 
 * @author 
 * @email 
 * @date 2021-04-22 15:05:37
 */
public interface FangdongDao extends BaseMapper<FangdongEntity> {
	
	List<FangdongVO> selectListVO(@Param("ew") Wrapper<FangdongEntity> wrapper);
	
	FangdongVO selectVO(@Param("ew") Wrapper<FangdongEntity> wrapper);
	
	List<FangdongView> selectListView(@Param("ew") Wrapper<FangdongEntity> wrapper);

	List<FangdongView> selectListView(Pagination page,@Param("ew") Wrapper<FangdongEntity> wrapper);
	
	FangdongView selectView(@Param("ew") Wrapper<FangdongEntity> wrapper);
	
}
