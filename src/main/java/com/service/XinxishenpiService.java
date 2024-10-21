package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinxishenpiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinxishenpiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinxishenpiView;


/**
 * 信息审批
 *
 * @author 
 * @email 
 * @date 2021-04-22 15:05:37
 */
public interface XinxishenpiService extends IService<XinxishenpiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinxishenpiVO> selectListVO(Wrapper<XinxishenpiEntity> wrapper);
   	
   	XinxishenpiVO selectVO(@Param("ew") Wrapper<XinxishenpiEntity> wrapper);
   	
   	List<XinxishenpiView> selectListView(Wrapper<XinxishenpiEntity> wrapper);
   	
   	XinxishenpiView selectView(@Param("ew") Wrapper<XinxishenpiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinxishenpiEntity> wrapper);
   	
}

