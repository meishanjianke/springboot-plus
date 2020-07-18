package com.example.foobar.controller;

import com.example.foobar.entity.FooBar;
import com.example.foobar.service.FooBarService;
import lombok.extern.slf4j.Slf4j;
import com.example.foobar.param.FooBarPageParam;
import com.springboot.plus.common.base.controller.BaseController;
import com.example.foobar.vo.FooBarQueryVO;
import com.springboot.plus.common.api.ApiResult;
import com.springboot.plus.common.pagination.Paging;
import com.springboot.plus.common.param.IdParam;
import com.springboot.plus.common.log.annotation.Module;
import com.springboot.plus.common.log.annotation.OperationLog;
import com.springboot.plus.common.log.enums.OperationLogType;
import com.springboot.plus.common.validator.groups.Add;
import com.springboot.plus.common.validator.groups.Update;
import org.springframework.validation.annotation.Validated;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * FooBar 控制器
 *
 * @author shenbin
 * @since 2020-07-18
 */
@Slf4j
@RestController
@RequestMapping("/fooBar")
@Module("foobar")
@Api(value = "FooBarAPI", tags = {"FooBar"})
public class FooBarController extends BaseController {

    @Autowired
    private FooBarService fooBarService;

    /**
     * 添加FooBar
     */
    @PostMapping("/add")
    @OperationLog(name = "添加FooBar", type = OperationLogType.ADD)
    @ApiOperation(value = "添加FooBar", response = ApiResult.class)
    public ApiResult<Boolean> addFooBar(@Validated(Add.class) @RequestBody FooBar fooBar) throws Exception {
        boolean flag = fooBarService.saveFooBar(fooBar);
        return ApiResult.result(flag);
    }

    /**
     * 修改FooBar
     */
    @PostMapping("/update")
    @OperationLog(name = "修改FooBar", type = OperationLogType.UPDATE)
    @ApiOperation(value = "修改FooBar", response = ApiResult.class)
    public ApiResult<Boolean> updateFooBar(@Validated(Update.class) @RequestBody FooBar fooBar) throws Exception {
        boolean flag = fooBarService.updateFooBar(fooBar);
        return ApiResult.result(flag);
    }

    /**
     * 删除FooBar
     */
    @PostMapping("/delete/{id}")
    @OperationLog(name = "删除FooBar", type = OperationLogType.DELETE)
    @ApiOperation(value = "删除FooBar", response = ApiResult.class)
    public ApiResult<Boolean> deleteFooBar(@PathVariable("id") Long id) throws Exception {
        boolean flag = fooBarService.deleteFooBar(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取FooBar详情
     */
    @GetMapping("/info/{id}")
    @OperationLog(name = "FooBar详情", type = OperationLogType.INFO)
    @ApiOperation(value = "FooBar详情", response = FooBarQueryVO.class)
    public ApiResult<FooBarQueryVO> getFooBar(@PathVariable("id") Long id) throws Exception {
        FooBarQueryVO fooBarQueryVO = fooBarService.getFooBarById(id);
        return ApiResult.ok(fooBarQueryVO);
    }

    /**
     * FooBar分页列表
     */
    @PostMapping("/getPageList")
    @OperationLog(name = "FooBar分页列表", type = OperationLogType.PAGE)
    @ApiOperation(value = "FooBar分页列表", response = FooBarQueryVO.class)
    public ApiResult<Paging<FooBarQueryVO>> getFooBarPageList(@Validated @RequestBody FooBarPageParam fooBarPageParam) throws Exception {
        Paging<FooBarQueryVO> paging = fooBarService.getFooBarPageList(fooBarPageParam);
        return ApiResult.ok(paging);
    }

}

