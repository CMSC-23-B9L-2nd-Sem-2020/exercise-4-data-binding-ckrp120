package com.example.cadacio_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.cadacio_exer4_slambook.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val user: UserInfo = UserInfo("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = user
        binding.submit.setOnClickListener {
            submit(it)
        }
    }




    private fun submit(view: View){
        binding.apply {
            user?.name = editName.text.toString()
            user?.nickname = nicknameEdit.text.toString()
            user?.age = ageEdit.text.toString()
            user?.birthday = birthdayEdit.text.toString()
            user?.course = courseEdit.text.toString()
            user?.mobNum = mobNumEdit.text.toString()
            user?.color = colorEdit.text.toString()
            user?.dream = dreamEdit.text.toString()
            user?.crush = crushEdit.text.toString()
            user?.message = messageEdit.text.toString()

            invalidateAll()

            nicknameView.visibility = View.VISIBLE
            nameView.visibility = View.VISIBLE
            age.visibility = View.VISIBLE
            thankYou.visibility = View.VISIBLE
            scrollview.visibility = View.GONE
            submit.visibility = View.GONE
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)


        }
    }

}
