package com.cxq.java.designpattern.adapter.loginadapter.v2.adapter;

import com.cxq.java.designpattern.adapter.loginadapter.ResultMsg;

/**
 * @author cnxqin
 * @desc
 * @date 2019/03/26 23:27
 */
public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }

    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public ResultMsg regist(String id, Object adapter) {
        return null;
    }
}
