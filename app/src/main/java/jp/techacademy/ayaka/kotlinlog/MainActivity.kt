package jp.techacademy.ayaka.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val human = Human("佐藤", 28, "剣道")      // 名前を佐藤、年齢28歳、趣味が剣道で、Humanのインスタンスを作る
    human.say()
    human.think()

    val human2 = Human("鈴木", 12, "家庭菜園")      // 名前を鈴木、年齢12歳、趣味が家庭菜園で、Humanのインスタンスを作る
    human2.say()
    human2.think()
    }
}
