package 抽象类与接口;
interface CanSwim{                                            //接口
    void swim();                                              //抽象方法
}
interface CanFly{                                             //接口
    void fly();                                               //抽象方法
}
class ActionCharacter{
    public void fight(){
        System.out.println("can fight!");
    }
}
class Hero extends ActionCharacter implements CanSwim,CanFly{  //Hero继承ActionCharacter，利用implements将CanSwim,CanFly两个接口合并
    public void swim(){
        System.out.println("can swim!");
    }
    public void fly(){
        System.out.println("can fly!");
    }
}
public class 引例{
    public static void u(CanSwim x){                           //接受接口参数
        x.swim();
    }
    public static void v(CanFly x){                           //接受接口参数
        x.fly();
    }
    public static void w(ActionCharacter x){                  //接受类参数
        x.fight();
    }
    public static void main(String[] args){
        Hero hero=new Hero();
        u(hero);
        v(hero);
        w(hero);
    }
}