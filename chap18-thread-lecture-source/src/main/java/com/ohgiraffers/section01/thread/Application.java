package com.ohgiraffers.section01.thread;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 쓰레드에 대해 이해할 수 있다. */
        /* 필기.
         *  프로세스(process)란 실행중인 프로그램이라고 할 수 있다.
         *  즉, 프로그램을 운영체제의 메모리와 cpu를 할당받아 실행되는 단위
         *
         * 필기.
         *  쓰레드(thread)란 프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다.
         *  모든 프로세스는 한 개 이상의 스레드를 가진다.
         *  두 개 이상의 쓰레드를 가지는 프로세스를 멀티쓰레드라고 한다.
        * */

        /* 필기.
         *  1. Thread 클래스를 상속받는 방법
         *  2. Runnable 인터페이스를 상속받는 방법
        * */

//        Car car = new Car();
//        Tank tank = new Tank();
//        Plane plane = new Plane();

        Thread t1 = new Car();
        Thread t2 = new Tank();
        Thread t3 = new Thread(new Plane());

//        t1.run();
//        t2.run();
//        t3.run();

        t1.start();
        t2.start();
        t3.start();

        System.out.println("main() 종료됨...");
    }
}


















