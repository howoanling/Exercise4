package com.example.epfinvestmentcalcutor

import android.app.DatePickerDialog
import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

class MainActivity : AppCompatActivity() {
    val c = Calendar.getInstance()
    val mYear = c.get(Calendar.YEAR)
    val mMonth = c.get(Calendar.MONTH)
    val mDay = c.get(Calendar.DAY_OF_MONTH)
    var currentYear:Int = 0

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker = findViewById<Button>(R.id.btn_date)
        btnDatePicker.setOnClickListener {

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                    // Display Selected date in textbox
                    bodDate.setText(" " + dayOfMonth + " /" + (monthOfYear + 1) + " /" + year)
                   val current = LocalDate.now()
                    currentYear = year

                }, mYear, mMonth, mDay

            )
            dpd.show()


        }

        val btnainvest = findViewById<Button>(R.id.determineaInvest)
        btnainvest.setOnClickListener {


            val ageNo = mYear - currentYear
            age.text = "Age : " + ageNo
            if (ageNo >= 16 && ageNo <= 20){
                val insvestment:Float = (5000 *0.3).toFloat()
                allowableinvest.text = "Allowable Investment : " + String.format("%.2f", insvestment )
            } else if (ageNo >= 21 && ageNo <= 25){
                val insvestment:Float = (14000 *0.3).toFloat()
                allowableinvest.text = "Allowable Investment : " + String.format("%.2f", insvestment )
            } else if (ageNo >= 26 && ageNo <= 30){
                val insvestment:Float = (29000 *0.3).toFloat()
                allowableinvest.text = "Allowable Investment : " + String.format("%.2f", insvestment )
            } else if (ageNo >= 31 && ageNo <= 35){
                val insvestment:Float = (50000 *0.3).toFloat()
                allowableinvest.text = "Allowable Investment : " + String.format("%.2f", insvestment )
            } else if (ageNo >= 36 && ageNo <= 40){
                val insvestment:Float = (78000 *0.3).toFloat()
                allowableinvest.text = "Allowable Investment : " + String.format("%.2f", insvestment )
            } else if (ageNo >= 41 && ageNo <= 45){
                val insvestment:Float = (116000 *0.3).toFloat()
                allowableinvest.text = "Allowable Investment : " + String.format("%.2f", insvestment )
            } else if (ageNo >= 46 && ageNo <= 50){
                val insvestment:Float = (165000 *0.3).toFloat()
                allowableinvest.text = "Allowable Investment : " + String.format("%.2f", insvestment )
            } else if (ageNo >= 51 && ageNo <= 55){
                val insvestment:Float = (228000 *0.3).toFloat()
                allowableinvest.text = "Allowable Investment : " + String.format("%.2f", insvestment )
            }

        }
    }


}

