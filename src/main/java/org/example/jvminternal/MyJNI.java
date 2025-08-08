package org.example.jvminternal;

public class MyJNI {
    public native int add(int a, int b);

    static {
        System.loadLibrary("myjni");
    }

    public static void main(String[] args) {
        MyJNI myJNI = new MyJNI();
        int result = myJNI.add(1, 2);
        System.out.println(result);
    }
}
