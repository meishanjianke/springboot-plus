package com.example.foobar.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.foobar.entity.FooBar;
import com.example.foobar.param.FooBarPageParam;
import com.example.foobar.vo.FooBarQueryVO;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * FooBar Mapper 接口
 *
 * @author shenbin
 * @since 2020-07-18
 */
@Repository
public interface FooBarMapper extends BaseMapper<FooBar> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    FooBarQueryVO getFooBarById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param fooBarQueryParam
     * @return
     */
    IPage<FooBarQueryVO> getFooBarPageList(@Param("page") Page page, @Param("param") FooBarPageParam fooBarPageParam);

}
