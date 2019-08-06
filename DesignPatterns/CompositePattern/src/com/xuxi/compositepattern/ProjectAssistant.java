package com.xuxi.compositepattern;

/**
 * 定义Leaf类ProjectAssistant
 *
 * Created by xuxi on 2018/9/30.
 */
public class ProjectAssistant extends Employer {

    public ProjectAssistant(String name){
        setName(name);
        employers = null; //项目主力，表示没有下属了
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
