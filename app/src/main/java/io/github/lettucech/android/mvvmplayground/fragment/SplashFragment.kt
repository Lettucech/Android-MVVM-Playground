package io.github.lettucech.android.mvvmplayground.fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.github.lettucech.android.mvvmplayground.R

class SplashFragment : Fragment() {
    private var countDownTimer: CountDownTimer? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onStart() {
        super.onStart()
        countDownTimer = object : CountDownTimer(3000, 3000) {
            override fun onFinish() {
                findNavController().navigate(R.id.action_splashFragment_to_welcomeFragment)
            }

            override fun onTick(p0: Long) {
            }

        }.start()
    }

    override fun onStop() {
        super.onStop()
        countDownTimer?.cancel()
    }
}