package cn.itfxq.business.food.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: marker
 * @email: 2579692606@qq.com
 * @date: created by 2021/10/29 9:42
 * @copyright: www.itxfq.cn 项目分享圈
 */
@Data
public class CollectionEntity {

    private Long id;
    private Food food;
    private Long foodid;
    private String username;
    private Date createtime;
}
