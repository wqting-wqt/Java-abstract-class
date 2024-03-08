package 抽象类与接口;
/*
        Map常用的方法
           HashMap<K,V> 是Map实现类
           K——此映射所维护的键的类型
           V——所映射值的类型
 */
import java.util.HashMap;
import java.util.Scanner;

class Book{
    HashMap<Integer,String> map=new HashMap<Integer, String>();
    public Book(){                     //构造方法
        map.put(195,"三字经");
        map.put(576,"百家姓");
        map.put(283,"千字文");
        map.put(476,"弟子规");
    }
    public String getName(int amount){
        if (map.containsKey(amount)){   //判断是否存在由指定的键映射的键-值对
            return map.get(amount);     //根据键返回相关联的值，即根据书号返回书名
        }
        else
            return "NOT FOUND";
    }
}
public class Map接口 {
    public static void main(String[] args){
        Book b=new Book();
        Scanner in=new Scanner(System.in);
        System.out.println(b.getName(in.nextInt()));
    }
}
