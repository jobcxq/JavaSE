package com.cxq.java.designpattern.observer.myobserver;

import com.cxq.java.designpattern.observer.Message;

/**
 * @author cnxqin
 * @desc 自定义观察者模式
 * @date 2019/03/27 23:38
 */
public class MyObserverTest {

    public static void main(String[] args){
        Publisher publisher = new Publisher("中国气象局");
        Subscriber subscriber1 = new Subscriber("小红");
        Subscriber subscriber2 = new Subscriber("小花");

        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);

        publisher.publish(new Message(publisher.getName(),"预计明天中到大雨，请市民做好防雨措施！"));


    }

}
