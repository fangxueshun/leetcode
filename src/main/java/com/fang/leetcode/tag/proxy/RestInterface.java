package com.fang.leetcode.tag.proxy;

import java.util.List;

/**
 * description
 * 休闲接口
 * @author fangxueshun
 * @date 2018/12/17
 */
public interface RestInterface {

    /**
     * 读书
     * @param bookName
     */
    void readBook(String bookName);

    /**
     * 逛街
     * @return 购买的物品清单
     */
    List<String> shopping();

}
