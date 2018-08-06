
```
void invoke(Object obj, Object... args) { ... }
void invoke(String s, Object obj, Object... args) { ... }

invoke(null, 1);    // 调用第二个 invoke 方法
invoke(null, 1, 2); // 调用第二个 invoke 方法
invoke(null, new Object[]{1}); // 只有手动绕开可变长参数的语法糖，
                               // 才能调用第一个 invoke 方法

```

重载与重写的区别


JVM方法调用五个指令
- invokestatic：用于调用静态方法。
- invokespecial：用于调用私有实例方法、构造器，及使用 super 关键字调用父类的实例方法或构造器，和所实...
- invokeinterface: 接口调用
- invoke


