package com.wangfei.designPattern.clone;

public class CloneTest {
    public static void main(String[] args) {
        // 浅复制
        Computer computer = new Computer("8core", "16G", "1TB");
        System.out.println("before simple clone:" + computer.toString());

        Computer computerClone1 = (Computer) computer.clone();
        System.out.println("after simple clone:" + computerClone1.toString());

        // 深复制
        Disk disk = new Disk("208G", "2TB");
        ComputerDetail computerDetail = new ComputerDetail("12core", "64G", disk);
        System.out.println("before deep clone:" + computerDetail.toString());
        ComputerDetail computerDetailClone = (ComputerDetail) computerDetail.clone();
        System.out.println("after deep clone :" + computerDetailClone.toString());
    }
}
