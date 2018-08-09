
Java通过反射方法调用路径
```
package jvmstudy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvokeTrace {

    public static void target(int i) {

        new Exception("#" + i).printStackTrace();

    }

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Class<MethodInvokeTrace> clazz = (Class<MethodInvokeTrace>) Class.forName("MethodInvokeTrace");
        Method method = clazz.getDeclaredMethod("target", int.class);
        method.invoke(null, 0);

    }
}
```

反射调用路径轨迹
```
java.lang.Exception: #0
	at jvmstudy.MethodInvokeTrace.target(MethodInvokeTrace.java:10)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at jvmstudy.MethodInvokeTrace.main(MethodInvokeTrace.java:17)
```

```
Method.invoke -> DelegatingMethodAccessorImpl.invoke -> NativeMethodAccessorImpl.invoke
```

反射两种实现方法
  委派实现和动态字节码生成实现，动态实现相比运行效率要快上20倍，但是字节码实现非常耗时，仅调用一次需要快上3到4倍。

