package 抽象类与接口;
/*
   Iterator接口
   定义：
    public interface Iterator{
    boolean hasNext();//hasNext()，判断是否还有元素
    Object next();    //next()，取的下一个元素
    void remove();    //remove()，删除集合中上一次next()方法返回的元素
    }

     本程序主要生成ArrayList对象，向上转型赋给Collection对象c，给对象c添加两个字符串，
     然后转换为Iterator对象并输出集合中的元素
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator接口 {
    public static void main(String[] args){
        Collection<String> c=new ArrayList<String>();
        c.add("a");
        c.add("b");
        Iterator it =c.iterator();
        for (;it.hasNext();){
            String s=(String) it.next();
            System.out.println(s);
        }
    }
}
