# DialogDemo
这是将Android第一行代码第二版翻译成kotlin的第四个项目，是从第三章开始的，当前项目使用kotlin演示了AiertDialog、ProgressDialog。
这一节比较短，我省略了那些普通的控件比如button、TextView等，还省略了布局，这些知识百度一下就了解了，不是太需要kotlin。

AiertDialog:

```kotlin
// 提示对话框
button_alertDialog.setOnClickListener {
    val dialog = AlertDialog.Builder(this) // 实例化一个AlertDialog对象
    dialog.setTitle("这是AlertDialog") // 设置对话框标题
    dialog.setMessage("是否退出") // 设置对话框内容
    dialog.setCancelable(false) // 设置是否能通过点击空白的地方关闭对话框
    // 这里的两个_是表示这个匿名函数的两个参数，我们没有使用那就可以用_来表示,
    // 而且使用了lambda表达式，就可以将lambda表达式移到括号外
    // 原本setPositiveButton函数是传入两个参数这里表面上看只传了一个，
    // 实践上传入的匿名函数使用了lambda表达式，放到了括号外面
    dialog.setPositiveButton("ok") { _, _ -> finish()} // 设置对话框的确定键的文字和逻辑
    dialog.setNegativeButton("关闭") { _, _ ->  } // 设置对话框的取消键的文字和逻辑
    dialog.show() // 显示对话框
}
```

ProgressDialog:
```kotlin
// 进度对话框
button_progressDialog.setOnClickListener {
    val progressDialog = ProgressDialog(this) // 实例化一个ProgressDialog对象
    progressDialog.setTitle("这是ProgressDialog") // 设置对话框标题
    progressDialog.setMessage("请稍后...") // 显示内容
    progressDialog.setCancelable(true) // 是否能够通过点击空白的地方关闭对话框
    progressDialog.show() // 显示对话框
}
```

代码很短但是知识很多，最重要的就是kotlin用lambda表达式写匿名函数的格式，而且要写在括号外面，这确实可读性很差，但是简便。