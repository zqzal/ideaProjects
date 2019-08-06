package com.xuxi.compositepattern;

import java.util.ArrayList;

/**
 * 定义Composite类ProjectManager类
 *
 * Created by xuxi on 2018/9/30.
 */
public class ProjectManager extends Employer {

    public ProjectManager(String name){
        setName(name);
        employers =new ArrayList<Employer>();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
