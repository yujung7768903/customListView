# customListView
> 커스텀 리스트뷰 쉬운 예제            
> 참고 : https://mixup.tistory.com/46        
> 위 블로그를 예제를 따라해보며 커스텀 리스트뷰를 공부함     

### 오류났던 부분
* ArrayIndexOutOfBoundsException 오류        
배열의 경우 접근하려는 인덱스가 배열의 범위를 벗어날 때 위와 같은 오류가 생길 수 있음
```
E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.example.customlistview, PID: 20550
    java.lang.RuntimeException: Unable to start activity ComponentInfo{com.example.customlistview/com.example.customlistview.MainActivity}: java.lang.ArrayIndexOutOfBoundsException: length=10; index=10
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3450)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3602)
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:85)
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2067)
        at android.os.Handler.dispatchMessage(Handler.java:106)
        at android.os.Looper.loop(Looper.java:223)
        at android.app.ActivityThread.main(ActivityThread.java:7660)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:975)
     Caused by: java.lang.ArrayIndexOutOfBoundsException: length=10; index=10   //
        at com.example.customlistview.MainActivity.onCreate(MainActivity.java:26) 
```
