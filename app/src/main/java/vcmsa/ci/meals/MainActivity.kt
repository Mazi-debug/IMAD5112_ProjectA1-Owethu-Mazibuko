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