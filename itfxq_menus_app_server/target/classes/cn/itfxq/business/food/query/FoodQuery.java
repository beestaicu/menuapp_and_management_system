package cn.itfxq.business.food.query;

import cn.itfxq.business.food.entity.Food;
import cn.itfxq.common.query.BaseQuery;
import lombok.Data;

/**
 * @description: FoodQuery
 * @author: marker
 * @email: 2579692606@qq.com
 * @date: created by 2021/11/19 14:47
 * @copyright: www.itxfq.cn 项目分享圈
 */
@Data
public class FoodQuery  extends BaseQuery {
    private String foodName;
}
