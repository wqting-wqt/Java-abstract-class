package 抽象类与接口;
/*
    List--ArrayList---泛型类
    声明举例：
         List<String>list=new ArrayList<String>();
 */
import java.util.ArrayList;
import java.util.List;

public class List接口 {
    public static void main(String[] args){
        List<String> list=null;
        list=new ArrayList<String>();
        list.add("beijing");//增加List中元素
        list.add(0,"");
        list.add("anhui");
        list.add("shanghai");
        list.remove(0);//删除List中元素
        list.remove("anhui ");
        System.out.println(list);

    }
}
