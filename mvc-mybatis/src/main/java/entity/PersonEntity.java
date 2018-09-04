package entity;

import base.BaseEntity;

/**
 * 描述：人员类
 *
 * @author YangFuXi Date Time 2018/8/30 14:19
 */
public class PersonEntity extends BaseEntity {
    private String name;
    private int age;
    private char sex;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
