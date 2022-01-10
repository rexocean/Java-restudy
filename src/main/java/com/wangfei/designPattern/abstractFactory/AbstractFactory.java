package com.wangfei.designPattern.abstractFactory;

import com.wangfei.designPattern.clone.Computer;

public abstract class AbstractFactory {

    public abstract Phone createPhone(String band);

    public abstract Computer createComputer(String band);
}
