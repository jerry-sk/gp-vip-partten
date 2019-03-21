package event;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 22:20
 */
public class Mouse extends  EventListener {
    public String name = "游戏鼠标";
    public void click(String who){
        System.out.println(name+"点击了鼠标.");
        this.trigger(MouseEventType.CLICK,who);
    }
    public void doubleClick(String who){
        System.out.println(name+"双击了鼠标.");
        this.trigger(MouseEventType.DOUBLECLICK,who);
    }
}
