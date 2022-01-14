package com.wangfei.corejava.chapter2;

import java.util.ArrayList;

public class Network {
    // 去掉了static关键字，Member对象知道自己属于哪个网络
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }

        public void leave() {
//            members.remove(this);
//            unEnroll(this);
            Network.this.members.remove(this);
        }

        // 检查一个Member对象是否属于某个特定网络（存在外部类与传递进来的参数进行比较的时候需要写明外部引用）
        public boolean belongsTo(Network network) {
            return Network.this == network;
        }

        @Override
        public String toString() {
            return "Member{" +
                    "name='" + name + '\'' +
                    ", friends=" + friends +
                    '}';
        }
    }

    private ArrayList<Member> members = new ArrayList<>();

    // 向社交网络添加社会成员
    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public void unEnroll(Member member) {
        members.remove(member);
    }

    private void printNetwork() {
        if (this.members.size() > 0) {
            this.members.forEach(System.out::println);
        } else {
            System.out.println("network size = 0");
        }
    }

    public static void main(String[] args) {
        Network myFace = new Network();
        Member fred = myFace.enroll("fred");
        myFace.printNetwork();
        fred.leave();
        myFace.printNetwork();
    }

}
