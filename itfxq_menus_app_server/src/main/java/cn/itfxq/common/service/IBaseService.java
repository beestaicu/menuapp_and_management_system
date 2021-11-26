package cn.itfxq.common.service;


import cn.itfxq.common.page.PageList;
import cn.itfxq.common.query.BaseQuery;

import java.util.List;

/**
 * @author: itfxq-项目库分享圈
 * @datetime: 2021/7/1 8:34
 * @qq: 2579692606
 * @description: 课程列表Service接口层
 */
public interface IBaseService<T> {

    //查询所有
    List<T> queryAll();
    //分页查询
    PageList  listpage(BaseQuery baseQuery);


}
