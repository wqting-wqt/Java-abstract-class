package 抽象类与接口;

interface PCI{                                            //接口
    void setName(String s);
    void run();
}
class VideoCard implements PCI{                           //类实现了前面的PCI接口
    String name="微星";
    public void setName(String s){
        name=s;
    }
    public void run(){
        System.out.println(name+"显卡已开始工作!");
    }
}
class SoundCard implements PCI{                           //类实现了前面的PCI接口
    String name="AC";
    public void setName(String s){
        name=s;
    }
    public void run(){
        System.out.println(name+"声卡已开始工作!");
    }
}
class MainBoard{
    public void interfacePCI(PCI pci){
        pci.run();
    }
    public void run(){
        System.out.println("主板已开始工作!");
    }
}
public class 接口 {                                     //模拟电脑组装
    public static void main(String[] args){
        MainBoard mainBoard=new MainBoard();
        VideoCard videoCard=new VideoCard();
        SoundCard soundCard=new SoundCard();
        videoCard.setName("华为");
        mainBoard.interfacePCI(videoCard);
        mainBoard.interfacePCI(soundCard);
        mainBoard.run();
    }
}
