package com.fang.leetcode.tag.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/12/17
 */
public class MyRest implements RestInterface {
    @Override
    public void readBook(String bookName) {
        System.out.println("read "+bookName+" by mobile");
    }

    @Override
    public List<String> shopping() {
        List<String> list = new ArrayList<>();
        list.add("羽绒服");
        list.add("笔记本");
        return list;
    }
}
