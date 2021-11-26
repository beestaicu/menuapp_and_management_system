package cn.itfxq.common.mapper;

import cn.itfxq.common.query.BaseQuery;

import java.util.List;

/**
 * @description: BaseMapper
 * @author: itfxq-码仔项目库分享圈
 * @qq: 交流咨询 qq2579692606
 * @datetime: 2021/7/1 14:46
 */
public interface BaseMapper<T> {
    //查询总的条数
    Long queryTotal(BaseQuery baseQuery);
    //分页查询数据
    List<T> queryData(BaseQuery baseQuery);
    //查询所有记录
    List<T> queryAll();
}
