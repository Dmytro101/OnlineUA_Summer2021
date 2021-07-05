package com.lesson4.task1;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<Entity> list = new ArrayList<Entity>();

    public void addRecord(Entity record) {
        list.add(record);
    }
}
