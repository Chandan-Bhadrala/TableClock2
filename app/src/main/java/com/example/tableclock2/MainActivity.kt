package com.example.tableclock2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.example.tableclock2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //This Code of line doesn't let screen to get off.
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val quotes = mutableListOf<String>(
            "Hustle",
            "Struggle",
            "Just do it",
            "Chase the Dream",
            "**it Happens",
            "Feel the Dream",
            "Believe in yourself",
            "Degree of Belief in yourself will Determine, your Degree of Success",
            "Never Stop",
            "Keep Going",
            "Keep Walking",
            "Pause",
            "Take a Break",
            "Imagine the Dream with relaxed/peaceful mind.",
            "Meditate to have a peaceful mind.",
            "Meditate to have a Lake like Mind, free of waves",
            "feel serenity",
            "Purpose of Life: Live, Laugh, Leave",
            "Live Life, just don't live",
            "Work keeps your soul young.",
            "Work is Worship",
            "One should Worship everyday",
            "Stay Alive",
            "Live Healthy Life",
            "Make good choices",
            "Your Life is outcome of your Choices",
            "To have a Good Future, take care of your present",
            "Live Life, Stay Alive",
            "Don't use Alcohol/Party to boost your Energy, Channel your Energy in Healthy Way",
            "Use music/walk/exercise/good food to replenish your energy",
            "Take a pause, Breathe Life around you",
            "Always remember God is on your side",
            "Never doubt/judge Gods Plan",
            "Try to understand his mystical plan rather",
            "Things will align eventually",
            "Don't feel alone, Meditate, use Diary writing to have a clearer mind",
            "Believe in yourself, Believe in God's Plan",
            "Try to look at Life as series of Phases, No Phase will last long or forever",
            "Phases of Life will be changing continuously",
            "No Phase of Life will Last forever",
            "Stop integrating one Phase of your Life on the period of, rest of your Life",
            "Understand Life is just sequence of phases, one will go another will come",
            "No Phase will Last forever",
            "Love yourself",
            "Enjoy yourself",
            "Learn to enjoy small things in life, this is a very important lesson to stay happy",
            "if you will start to look for happiness in big things, then you will be rarely happy," +
                    " as big things happen rarely",
            "Enjoy small things like cup of Tea, time spent with your loved ones, music, movie, work, your passion" +
                    "then you will be happy mostly",
            "Don't be alone too much",
            "3 key pillars of Life, Health, Wealth, Intellect",
            "Lack of either of pillar of Life will eventually poison your life",
            "Impulsive mind will only lead to Destruction",
            "keep one arm distance from everything in Life\nTo see things clearly",
            "Rather than to look at your Life so closely, Look at your Life from Distance from " +
                    "above the Clouds, Like God sees it.",
            "Then you will see the Beauty of Life",
            "Try not focus too much on to any phase of your Life, Look at Life from Broader/Wider Aspect\n" +
                    "   if possible, try to look at all the phases of life, you have been through",
            "You will see Quite a Mixture of Life that you have been through & your life will always be a" +
                    "mixture of different phases",
            "Keep a journal of Ideas",
            "Practice Gratification",
            "Believe in yourself",
            "Discus your Ideas with Loved ones",
            "Have a Good circle of people in Life",
            "Focus",
            "Sometimes just lose focus & rest",
            "Because you may start fast at your journey, but by the mid or end of your journey" +
                    "you may find yourself tired & unable to move as fast as you had in your early stage " +
                    "of journey, So...",
            "it's important to learn how to keep walking & strolling towards the end of your journey",
            "Journey to success never ends",
            "Therefore, learn how to enjoy the Journey",
            "Don't wait to arrive at Destination to get happy, rather learn to enjoy the Journey",
            "No one gets failed/successful due to one mistake/one good deed",
            "It takes long series of Effort in one Direction to get success/failure",
            "Enjoy Life",
            "Be Cheerful",
            "Be Positive",
            "Stay Blessed",
            "Stay Alive, try to upgrade yourself everyday",
            "Because if you are not upgrading yourself every day, then you are getting degrade by default everyday",
        )

    }
}



