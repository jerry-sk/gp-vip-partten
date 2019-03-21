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
public class EventListener {

    private Map<String, Event> events = new HashMap();

    public void addListener(String type, Object target, Method method) {
        Event event = new Event(this, target, method);
        events.put(type, event);
    }

    public void trigger(String type,Object args) {
        if (events.containsKey(type)) {
            try {
                Event event = events.get(type);
                if (event.getCallback().getParameters().length == 2) {
                    event.getCallback().invoke(event.getTarget(),event,args);
                }
                if (event.getCallback().getParameters().length == 1) {
                    event.getCallback().invoke(event.getTarget(),event);
                }
                /*
                if (event.getCallback().getParameters().length == 1) {
                    event.getCallback().invoke(event,event.getSource(),args);
                }
                */
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
