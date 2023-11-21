package www.baizhi.study.ArrayList.Test;

import java.util.ArrayList;

public class PhoneMain {
    public static void main(String[] args) {
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        phoneArrayList.add(new Phone("小米",1999));
        phoneArrayList.add(new Phone("苹果",8000));
        phoneArrayList.add(new Phone("锤子",2999));

        for (int i = 0; i < phoneArrayList.size(); i++) {
            System.out.println("现在共有" + phoneArrayList.get(i).toString());
        }
        System.out.println("查询3000以内的手机");
        for (Phone Phone : phoneArrayList) {
            if (Phone.getPrice() < 3000) {
                System.out.println(Phone.toString());
            }
        }
    }
}
