package event;

import java.lang.reflect.Method;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 21:27
 */
public class Event {
    //事件源
    private  Object source;
    //时间出发通知谁，观察者
    private  Object target;

    private  Method callback;

    private  String trigger;

    private  long time;

    public Event(Object source,Object target,Method callback){
        this.source =source;
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
