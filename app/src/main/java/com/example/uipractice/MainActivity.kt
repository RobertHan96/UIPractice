package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
// viewDidRoad()에 해당하는 부분
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//    addSubView()와 유사한 개념으로 해당 XML파일의 내용을 가져와서 뷰에 뿌려줌
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
//            로그인 버튼이 눌렸을때 할일을 지정하는 부분, 클로저와 유사
            Log.d("LoginBtn", "LoginButton is clicked")
            val userInput =  emailEdit.text.toString()

            //  입력한 아이디가 admin@tj.com 이면 관리자입니다! 라는 토스트 출력
//            if (userInput == "admin@tj.com") {
//                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
//            } else {
//                val formattedStr = "입력한 아이디는 $userInput 입니다."
//                Toast.makeText(this, formattedStr, Toast.LENGTH_SHORT).show()
//            }

            // student > 학생입니다, parent > 학부모입니다, teacher > 교사입니다 토스트 출력

            when (userInput) {
                "admin@tj.com" -> { Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()}
                "student" -> { Toast.makeText(this, "학생입니다.", Toast.LENGTH_SHORT).show()}
                "parent" -> { Toast.makeText(this, "학부모입니다.", Toast.LENGTH_SHORT).show()}
                "teacher" -> { Toast.makeText(this, "교사입니다.", Toast.LENGTH_SHORT).show()}
                else -> {
                    val formattedStr = "입력한 아이디는 $userInput 입니다."
                    Toast.makeText(this, formattedStr, Toast.LENGTH_SHORT).show()
                }
            }
        }

        loginBtn.setOnLongClickListener {
            Log.d("LoginBtn", "LoginButton is long clicked")
            return@setOnLongClickListener false
//            return true : 롱클릭 이벤트만 처리, false : 일반 클릭 이벤트도 같이 실행
//            return@함수 이름 : return, break 등 사용시, 해당 함수 이름을 명시해줘야 제대로 인식함
        }
    }
}
