package cn.itfxq.auth.query;

import cn.itfxq.common.query.BaseQuery;
import lombok.Data;

/**
 * @Author: soulcoder码仔项目分享圈
 * @Decription:
 * @Date: Created on 2021/7/24 8:59
 * @Email: 2579692606@qq.com
 */
@Data
public class UserQuery extends BaseQuery {


    private String username;

    private String email;

    private Long type;//1表示管理员 2表示老师用户

}
