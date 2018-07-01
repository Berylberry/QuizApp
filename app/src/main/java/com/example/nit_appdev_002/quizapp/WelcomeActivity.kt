package com.example.nit_appdev_002.quizapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    private var score:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

    }

    fun submitAnswers(view: View){
        score = 0
        val firstRadioGroup = first_radio_group.checkedRadioButtonId
        val secondRadioGroup = second_radio_group.checkedRadioButtonId
        val fourthRadioGroup = fourth_radio_group.checkedRadioButtonId
        val thirdAnswer1 = third_question_answer_1.text.toString()
        val thirdAnswer2 = third_question_answer_2.text.toString()
        val fifthAnswer = fifth_question_answer.text.toString()
        val sixthAnswer1 = sixth_question_answer_1.text.toString()
        val sixthAnswer2 = sixth_question_answer_2.text.toString()
        val sixthAnswer3 = sixth_question_answer_3.text.toString()

        if (firstRadioGroup == -1 || secondRadioGroup == -1 || fourthRadioGroup == -1 ||
                thirdAnswer1.isNullOrEmpty() || thirdAnswer2.isNullOrEmpty() || fifthAnswer.isNullOrEmpty() ||
                sixthAnswer1.isNullOrEmpty() || sixthAnswer2.isNullOrEmpty() || sixthAnswer3.isNullOrEmpty()){
            Toast.makeText(this, "Please answer all questions before submitting.", Toast.LENGTH_LONG).show()
        }else {
            val selectedFirstRadio:RadioButton = findViewById(firstRadioGroup)
            val selectedSecondRadio:RadioButton = findViewById(secondRadioGroup)
            val selectedFourthRadio:RadioButton = findViewById(fourthRadioGroup)
            if (selectedFirstRadio.text.toString() == "Germany"){
                score = score + 1
            }

            if (selectedSecondRadio.text.toString() == "True"){
                score = score + 1
            }

            if (selectedFourthRadio.text.toString() == "China"){
                score = score + 1
            }

            if (thirdAnswer1.toUpperCase() == "CHRISTMAS" && thirdAnswer2.toUpperCase() == "MEXICO"){
                score = score + 1
            }

            if (fifthAnswer.toUpperCase() == "RABANADA"){
                score = score + 1
            }

            if (sixthAnswer1.toUpperCase() == "CHRISTMAS" && sixthAnswer2.toUpperCase() == "STOCKINGS" && sixthAnswer3.toUpperCase() == "EVE"){
                score = score + 1
            }

            val a = "You scored"
            val b = "out of 6. Congratulations."
            val scoreText = "$a $score $b"
            Toast.makeText(this, scoreText, Toast.LENGTH_LONG).show()

            var answerText = "The answers are:"
            answerText += "\nChristmas Trees : Germany"
            answerText += "\n"
            answerText += "\n"+resources.getString(R.string.first_question_toast)
            answerText += "\n"
            answerText += "\nJungle Bells : True"
            answerText += "\n"
            answerText += "\n"+resources.getString(R.string.second_question_toast)
            answerText += "\n"
            answerText += "\nFlowery : Christmas and Mexico"
            answerText += "\n"
            answerText += "\nDecorations : China"
            answerText += "\n"
            answerText += "\n"+resources.getString(R.string.fourth_question_toast)
            answerText += "\n"
            answerText += "\nToasty : Rabanada"
            answerText += "\n"
            answerText += "\n"+resources.getString(R.string.fifth_question_toast)
            answerText += "\n"
            answerText += "\nSanta : Christmas, Stockings and Eve"
            answerText += "\n"
            answerText += "\n"+resources.getString(R.string.sixth_question_toast)

            answer_text_view.text = answerText
        }
    }
}
