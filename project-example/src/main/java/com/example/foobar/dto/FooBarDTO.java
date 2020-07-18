package com.example.foobar.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * FooBar 数据传输对象
 * </pre>
 *
 * @author shenbin
 * @date 2020-07-18
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "FooBarDTO对象")
public class FooBarDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("Foo")
    private String foo;

    @ApiModelProperty("Bar")
    private String bar;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("状态，0：禁用，1：启用")
    private Integer state;

    @ApiModelProperty("版本")
    private Integer version;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date updateTime;
}