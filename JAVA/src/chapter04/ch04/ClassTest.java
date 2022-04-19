package chapter04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class<?> c1 = Class.forName("chapter04.ch04.Person");
        Person person = (Person) c1.newInstance();

        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        // null 값이 나옴
        System.out.println(p);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person personKim = (Person) cons.newInstance(initargs);
        System.out.println(personKim);
    }
}
