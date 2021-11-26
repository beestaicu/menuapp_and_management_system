package cn.itfxq.common.query;

import lombok.Data;

/**
 * @description: BaseQuery 公共的查询条件
 * @author: mark-项目库分享圈
 * @qq: 交流咨询 qq2579692606
 * @官网:www.itfxq.cn
 * @datetime: 2021/7/1 14:44
 */
@Data
public class BaseQuery {
    //开始位置
    private Integer offset = 0;
    //每页显示条数
    private Integer pageSize = 10;
}
