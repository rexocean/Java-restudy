package com.wangfei.designPattern.clone;

public class ComputerDetail implements Cloneable {
    private String cpu;
    private String memory;
    private Disk disk;

    public ComputerDetail(String cpu, String memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public Object clone() {
        try {
            // 深复制
            ComputerDetail computerDetail = (ComputerDetail) super.clone();
            computerDetail.disk = (Disk) this.disk.clone();
            return computerDetail;
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
