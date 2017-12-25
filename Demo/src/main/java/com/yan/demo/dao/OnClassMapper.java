package com.yan.demo.dao;

import com.yan.demo.bean.OnClass;
import com.yan.demo.bean.OnClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnClassMapper {
    long countByExample(OnClassExample example);

    int deleteByExample(OnClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OnClass record);

    int insertSelective(OnClass record);

    List<OnClass> selectByExample(OnClassExample example);

    OnClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OnClass record, @Param("example") OnClassExample example);

    int updateByExample(@Param("record") OnClass record, @Param("example") OnClassExample example);

    int updateByPrimaryKeySelective(OnClass record);

    int updateByPrimaryKey(OnClass record);
}