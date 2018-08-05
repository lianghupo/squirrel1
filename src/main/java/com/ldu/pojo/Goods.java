package com.ldu.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:guoxilong
 * 用虚拟币取代原有价格字段
 * 新增成色字段，作为排序指标
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer id;

    private Integer catelogId;

    private Integer userId;

    private String name;

    private Integer price;

    private Integer percentOfNew;

    private String startTime;

    private String endTime;

    private String polishTime;

    private Integer commetNum;

    private String describle;

}