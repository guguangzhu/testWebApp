package com.guge.test.service;

import java.util.List;

/**
 * Created by Guge on 2017/4/7.
 */
public class ListObject extends AbstractJsonObject {

    // 列表对象
    private List<?> items;

    public List<?> getItems() {
        return items;
    }

    public void setItems(List<?> items) {
        this.items = items;
    }

}