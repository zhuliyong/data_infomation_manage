package com.example.designmodel.single;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式
 * 1、私有构造函数，为了不在其他地方初始化
 * 2、私有实例初始化
 * 3、提供外部调用的方法
 * @author peter
 * @version 1.1
 * @date 2019/9/10 14:45
 */
@Component
public class SingleObject {

    private SingleObject(){}; //1申明构造函数私有
    private static SingleObject instance = new SingleObject(); //2、私有实例初始化
    public static SingleObject getInstance(){  //3、提供对外的入口
        return instance;
    } //3、对外开发接口

    /* 定义可使用的方法 */
    public static Map<String,Object> map = new HashMap<String, Object>();
    public void do1(String str){
        System.out.println(str);
        map.put(str,str);
    }
    public void do2(){
        System.out.println("欢迎访问单例模式");
        System.out.println(map.toString());
    }



}
