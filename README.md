Designer code
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:srcCompat="@drawable/backgroundimage"
        tools:layout_editor_absoluteX="143dp"
        tools:layout_editor_absoluteY="76dp" />

    <TextView
        android:id="@+id/textDisplay1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FFFFFF"
        android:text="What is the time of day ?"
        android:textColor="#000000"
        android:textSize="35sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.428"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.187" />

    <Button
        android:id="@+id/log1"
        android:layout_width="281dp"
        android:layout_height="49dp"
        android:backgroundTint="#060270"
        android:textSize="20sp"
        android:text="Click Me"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.587" />

    <EditText
        android:id="@+id/textInput"
        android:layout_width="198dp"
        android:layout_height="66dp"
        android:background="#FFFFFF"
        android:ems="10"
        android:gravity="center"
        android:hint="Input"
        android:inputType="text"
        android:textColor="#000000"
        android:textSize="25sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.484" />

    <TextView
        android:id="@+id/textDisplay2"
        android:layout_width="340dp"
        android:layout_height="63dp"
        android:background="#FFFFFF"
        android:ems="10"
        android:text="Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner"
        android:textColor="#000000"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.492"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.332" />

    <Button
        android:id="@+id/log2"
        android:layout_width="290dp"
        android:layout_height="48dp"
        android:textSize="20sp"
        android:text="Reset"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="@+id/imageView"
        app:layout_constraintTop_toTopOf="@+id/imageView"
        app:layout_constraintVertical_bias="0.702" />

    <TextView
        android:id="@+id/textDisplay3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="25sp"
        android:background="#FFFFFF"
        android:text="Your results will be shown here"
        android:textColor="#000000"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="@+id/imageView"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.807" />


</androidx.constraintlayout.widget.ConstraintLayout>

Kit file code
package vcmsa.ci.meals

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

/*
The independant institute of education (pty) ltd 2025
IMAD5112 MM

learning unit 2
CH3 section 2 (3.2)
 */

        /* syntax to call the button from the designer to the code */
        val reset = findViewById<Button>(R.id.log2)
        /* syntax to call the textview from designer to code */
        val textdisplay1 = findViewById<TextView>(R.id.textDisplay1)
        /* syntax to call the textview from designer to code */
        val textdisplay2 = findViewById<TextView>(R.id.textDisplay2)
        /* syntax to call the textview from designer to code */
        val displaytext = findViewById<TextView>(R.id.textDisplay3)
        /* syntax to call the button from the designer to the code */
        val log = findViewById<Button>(R.id.log1)
        /* syntax to call the edittext from the designer to the code */
        val textbox = findViewById<EditText>(R.id.textInput)
        /* syntax to convert edittext to string */
        val text = textbox.text.toString()

        /*
        The independant institute of education (pty) ltd 2025
        IMAD5112 MM

        Learning unit 2
                CH4 section 1 (4.1)
        */

        /*
        The independant institute of education (pty) ltd 2025
        IMAD5112 MM

        learning unit 2
                CH5 section 1 (5.1)
        */

        /* The independant institute of education (pty) ltd 2025
        IMAD5112 MM
                learning unit 3
                CH2 section 1 (2.1)
        */

        /* syntax to check if input is "Morning" */
        if(text == "Morning" || text == "morning"){
            /* syntax to change attributes */
            log.setOnClickListener{
                /* syntax to change textview text */
                displaytext.text = "Oatmeal, Scrambled eggs with toast, Greek yorgurt parfait"
                /* syntax to change attributes */
                reset.setOnClickListener{
                    /* syntax to clear input text */
                    textbox.text.clear()
                    /*syntax to change textview text*/
                    displaytext.text = ""
                }
            }
            /* syntax to check if input is "Mid-morning" */
        }else if (text == "Mid-morning" || text == "mid-morning"){
            log.setOnClickListener{
                /* syntax to change textview text */
                displaytext.text = "Smoothie, Boiled Eggs & Whole Grain Cracker, Cottage Cheese with nuts & honey"
                /* syntax to change attributes */
                reset.setOnClickListener{
                    /* syntax to change textview text */
                    displaytext.text = ""
                    /* syntax to clear input text */
                    textbox.text.clear()
                }
            }
            /* syntax to check if input is "Afternoon" */
        } else if(text == "Afternoon" || text == "afternoon"){
            /* syntax to change attributes */
            log.setOnClickListener{
                displaytext.text = "Grilled chicken salad, Brown rice & Stir-Fried Veggies, Whole wheat wrap"
                /* syntax to change attributes */
                reset.setOnClickListener{
                    /*syntax to change textview text*/
                    displaytext.text = ""
                    /* syntax to clear input text */
                    textbox.text.clear()
                }
            }
            /* syntax to check if input is "Mid-afternoon" */
        }else if(text == "Mid-afternoon" || text == "mid-afternoon"){
            /* syntax to change attributes */
            log.setOnClickListener{
                /* syntax to change textview text */
                displaytext.text = "Hummus with veggies & whole wheat pita, Tuna & avocado on crackers, fruit & nut mix"
                /* syntax to change attributes */
                reset.setOnClickListener{
                    /* syntax to change textview text */
                    displaytext.text = ""
                    /* syntax to clear input text */
                    textbox.text.clear()
                }
            }

            /* syntax to check if input is "Dinner" */
        }else if(text == "Dinner" || text == "dinner") {
            /* syntax to change attributes */
            log.setOnClickListener{
                /* syntax to change textview text */
                displaytext.text = "Grilled salmon with quinoa, lentil soup with whole wheat, chicken stir-fry with brown rice"
                /*clicking the button changes the attributes*/
                reset.setOnClickListener{
                    /* syntax to change textview text */
                    displaytext.text = ""
                    /* syntax to clear input text */
                    textbox.text.clear()
                }
            }
            /*Syntax to check if the user inputted something or text is empty*/

            /*
            Varsity College Durban North
            Tutor IMAD5112
            Jorry
             */

        }else if (text == null) {
            /*syntax to display text on textview*/
            displaytext.text = "Please type in what time of day it is ?"
            reset.setOnClickListener{
                /*syntax to display text on textview*/
                displaytext.text = ""
                /* syntax to clear input text */
                textbox.text.clear()
            }
            /*syntax to check if the user mistyped the input*/
        }
    }
}

the code above is meant to create an app for the user to be able to get meal plan suggestions based on the time of day
