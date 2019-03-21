package event;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 22:20
 */
public class MouseTest{
    public static void main(String[] args) throws Exception {
       // EventListener eventListener = new EventListener();
        //创建一个观察者
        Callback callback = new Callback();
        //eventListener.addListener(MouseEventType.CLICK,callback,Callback.class.getMethod("onClick",Object.class));
        //创建一个被观察者也就是时间源
        Mouse mouse = new Mouse();
       // mouse.addListener(MouseEventType.CLICK,callback,callback.getClass().getMethod("onClick",Event.class));
        mouse.addListener(MouseEventType.CLICK,callback,callback.getClass().getMethod("onClick",Event.class,Object.class));
        mouse.addListener(MouseEventType.DOUBLECLICK,callback,callback.getClass().getMethod("onClick",Event.class,Object.class));

        mouse.click("jerry");
        mouse.doubleClick("jerry");
    }
}
