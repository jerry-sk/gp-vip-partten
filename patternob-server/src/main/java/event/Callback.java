package event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 21:27
 */
public class Callback  {

    /***
     * 一般回调函数会有一个或者2个参数，比如js里面回调函数一般为Event；actionScript 一般是event和Object
     * @param event
     */

    public void  onClick(Event event){
        System.out.println("鼠标名字:"+((Mouse)event.getSource()).name +",鼠标单击后已通知回调函数");
    }
    public void  onClick(Event event,Object args){
        System.out.println("\n谁点击了鼠标:"+args+"\n鼠标名字:"+((Mouse)event.getSource()).name +",鼠标单击后已通知回调函数");
    }
    public void  doubleClick(Event event){
        System.out.println("\n鼠标名字:"+((Mouse)event.getSource()).name +",鼠标双击击后已通知回调函数");

    }
}
