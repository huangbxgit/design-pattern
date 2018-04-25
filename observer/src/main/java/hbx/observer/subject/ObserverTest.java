package hbx.observer.subject;

import hbx.observer.code.Event;
import hbx.observer.proxy.SubjectProxy;

import java.lang.reflect.Method;

public class ObserverTest {

    public static void main(String[] args) {

        try{

            //观察者
            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});


            //这里写Lily
            Subject subject = new Subject();
            subject.addLisenter(SubjectEventType.ON_ADD,observer,advice);
            subject.addLisenter(SubjectEventType.ON_EDIT,observer,advice);
            subject.addLisenter(SubjectEventType.ON_RMOVE,observer,advice);
            subject.addLisenter(SubjectEventType.ON_QUERY,observer,advice);

            ISubject proxySubject = (ISubject)new SubjectProxy(subject).getProxyInstance();
            proxySubject.add();
            proxySubject.remove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
