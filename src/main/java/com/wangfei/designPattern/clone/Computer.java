package com.wangfei.designPattern.clone;

public class Computer implements Cloneable {
    private String cpu;
    private String memory;
    private String disk;

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public Object clone() {
        // 浅复制
        try {
            return (Computer) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "cpu=" + cpu + "memory=" + memory + "disk" + disk;
    }
}
