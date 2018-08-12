编程语言到Class文件

一个Class文件可以非常严谨的被描述成
```
ClassFile {
    u4 maigc; //
    u2 minor_version; // 小版本
    u2 major_version; // 大版本
    u2 constant_pool_count; //常量池个数
    cp_info constant_pool[constant_pool_count-1]; //常量池
    u2 access_flags; // 访问修饰符
    u2 this_class; // 自身的类你用
    u2 super_class; // 父类引用
    u2 interfaces_count; // 接口数量
    u2 interfaces[interfaces_count]; // 实现的接口引用
    u2 fields_count; // 字段数量
    field_info fields[fields_count]; // 字段
    u2 methods_count; //方法数量
    method_info methods[methods_count]; // 方法
    u2 attributes_count;// 属性属性
    attribute_info atributes[attributes_count];属性
}

```
**Magic Number** 必须以```0xCAFEBABE```开头,比如不以此开头，校验失败    

Class文件版本号和Java版本对应关系     
 大版本 |  小版本  | Java版本   
 --- |  ---  | --- 
 45 |  3  | 1.1 
 46 |  0  | 1.2 
 47 |  0  | 1.3 
 48 |  0  | 1.4 
 49 |  0  | 1.5 
 50 |  0  | 1.6 
 51 |  0  | 1.7 
 52 |  0  | 1.8 
 53 |  0  | 1.9 
 
 
