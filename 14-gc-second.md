## Java对象存活统计
- 大部分对象创建之后生命周期非常短暂,少部分对象长期存活
- 新生代  老年代划分依据
- 新生代划分eden区和survivor区,survivor再分为from区和to区
- 多线程在堆上eden分配内存问题
- TLAB(Thread Local Allocation Buffer) 每个线程预分配一段连续内存作为该线程私有TLAB
- 指针加法(bump the pointer)分配内存
- Minor GC Eden内存区域耗尽时触发,存活下来的对象送到Survivor区
- survivor复制多少次才会晋升到老年代 ``` -XX:+MaxTenuringThreshold```
- ```XX:TargetSurvivorRatio``` Survivor占用比例较高会提前晋升到老年代
- 卡表(Card Table)  老年代对象引用新生代对象 

## HotSpot VM垃圾回收
- 新生代垃圾回收
  - Serial   标记复制算法  单线程 
  - Parallel Scavenge   标记复制算法  注重吞吐量 (不能和CMS共用)
  - Parallel New  标记复制算法 Serial的多线程版本

- 老年代
 - Serial Old
 - Parallel Old
 - CMS  并发标记清除 除少数几个地方需要STW,其它在应用运行中进行垃圾回收 Java 9中被废弃 G1替代

- G1(Garbage First) 
  - 横跨新生代和老年代
  - 堆分层多个区域 
  - 采用标记压缩算法 
  - 优先选择垃圾较多区域进行回收

 - ZGC 
  - Java11 引入
  - 号称不超过10ms 
  -  

