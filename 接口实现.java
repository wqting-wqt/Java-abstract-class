package 抽象类与接口;
interface Shape{                               //定义接口Shape
    double PI=3.14;
    void print();
}
class Circle implements Shape{                  //实现接口Shape
    public void print(){
        System.out.println("我想实现的接口: "+PI);
    }
}
public class 接口实现 {
    public static void main(String[] args){
        Circle circle=new Circle();
        circle.print();
    }
}
