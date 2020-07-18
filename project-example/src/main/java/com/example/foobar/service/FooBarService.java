package com.example.foobar.service;

import com.example.foobar.entity.FooBar;
import com.example.foobar.param.FooBarPageParam;
import com.springboot.plus.common.base.service.BaseService;
import com.example.foobar.vo.FooBarQueryVO;
import com.springboot.plus.common.pagination.Paging;

/**
 * FooBar 服务类
 *
 * @author shenbin
 * @since 2020-07-18
 */
public interface FooBarService extends BaseService<FooBar> {

    /**
     * 保存
     *
     * @param fooBar
     * @return
     * @throws Exception
     */
    boolean saveFooBar(FooBar fooBar) throws Exception;

    /**
     * 修改
     *
     * @param fooBar
     * @return
     * @throws Exception
     */
    boolean updateFooBar(FooBar fooBar) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteFooBar(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    FooBarQueryVO getFooBarById(Long id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param fooBarQueryParam
     * @return
     * @throws Exception
     */
    Paging<FooBarQueryVO> getFooBarPageList(FooBarPageParam fooBarPageParam) throws Exception;

}
