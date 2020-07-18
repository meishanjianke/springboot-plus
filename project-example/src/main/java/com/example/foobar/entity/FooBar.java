package com.example.foobar.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.springboot.plus.common.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.springboot.plus.common.validator.groups.Update;

/**
 * FooBar
 *
 * @author shenbin
 * @since 2020-07-18
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "FooBar对象")
public class FooBar extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "主键不能为空")
    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @NotBlank(message = "名称不能为空")
    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("Foo")
    private String foo;

    @NotBlank(message = "Bar不能为空")
    @ApiModelProperty("Bar")
    private String bar;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("状态，0：禁用，1：启用")
    private Integer state;

    @ApiModelProperty("版本")
    @Version
    private Integer version;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date updateTime;

}
