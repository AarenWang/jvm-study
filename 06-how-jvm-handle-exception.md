
```
public class HelloException{

  public static void main(String[] args){
    try{
      mayThrowException();
    } catch (Exception e){
       e.printStackTrace();
    }
  }

  private static void mayThrowException() throws Exception{
      throw new Exception("Exception");
  }
}

```

```
 public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=2, args_size=1
         0: invokestatic  #2                  // Method mayThrowException:()V
         3: goto          11
         6: astore_1
         7: aload_1
         8: invokevirtual #4                  // Method java/lang/Exception.printStackTrace:()V
        11: return
      Exception table:
         from    to  target type
             0     3     6   Class java/lang/Exception
      LineNumberTable:
        line 5: 0
        line 8: 3
        line 6: 6
        line 7: 7
        line 9: 11
      StackMapTable: number_of_entries = 2
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */
}
```
