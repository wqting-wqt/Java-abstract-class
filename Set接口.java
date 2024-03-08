package 抽象类与接口;

import java.util.*;

/*
        最常使用的是HashSet：
        Set<String >set=new HashSet<String>();
        声明一个Set实例
        Iterator<String> it=set.iterator();       //创建Set集合迭代器
        while (it.hasNext()){
        }
 */
public class Set接口 {
    public static void main(String[] args){
        List list=new ArrayList<String>();       //创建List集合对象
        list.add("first");                       //向集合中添加元素
        list.add("second");
        list.add("third");
        list.add("second");
        Set<String >set=new HashSet<String>();    //创建List集合对象
        set.addAll(list);                         //将List集合添加到Set集合中
        Iterator<String> it=set.iterator();       //创建Set集合迭代器
        System.out.println("集合中的元素是：");
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}
