package com.gaoxianglong.dialogdemo

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        // 进度对话框
        button_progressDialog.setOnClickListener {
            val progressDialog = ProgressDialog(this) // 实例化一个ProgressDialog对象
            progressDialog.setTitle("这是ProgressDialog") // 设置对话框标题
            progressDialog.setMessage("请稍后...") // 显示内容
            progressDialog.setCancelable(true) // 是否能够通过点击空白的地方关闭对话框
            progressDialog.show() // 显示对话框
        }
    }
}
