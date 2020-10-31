package com.reflectionAPIs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestForRef {

    public void openBrowser(){
        System.out.println("open browser");
    }

    public void OpenURL(String url){
        System.out.println("url "+url);
    }

    public void login(String cn, String cp){
        System.out.println(cn + " password is " + cp);
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestForRef rf = new TestForRef();
        String keyword = "openBrowser";
        String arg1 = "par1";
        String arg2 = "par2";

        Class aClass = rf.getClass();
        Method[] m = aClass.getDeclaredMethods();
        for(Method x: m){
            if(x.getName().equals(keyword)){
                x.invoke(rf);
            }
        }

    }


}
