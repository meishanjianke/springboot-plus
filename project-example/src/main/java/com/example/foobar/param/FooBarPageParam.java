package com.example.foobar.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.springboot.plus.common.pagination.BasePageOrderParam;

/**
 * <pre>
 * FooBar 分页参数对象
 * </pre>
 *
 * @author shenbin
 * @date 2020-07-18
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "FooBar分页参数")
public class FooBarPageParam extends BasePageOrderParam {
    private static final long serialVersionUID = 1L;
}
