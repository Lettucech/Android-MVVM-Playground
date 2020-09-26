package io.github.lettucech.android.mvvmplayground.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.github.lettucech.android.mvvmplayground.R
import io.github.lettucech.android.mvvmplayground.viewmodel.WelcomeViewModel
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment() {

    private lateinit var viewModel: WelcomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        viewModel = WelcomeViewModel.Factory(
            goToLogin = {
                findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToNormalUserLoginFragment())
            },
            goToVipLogin = {
                findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToVipLoginFragment())
            },
            goToRegister = {
                findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToRegisterFragment())
            }
        ).create(WelcomeViewModel::class.java)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener { viewModel.onLoginClick() }
        btn_vipLogin.setOnClickListener { viewModel.onVipLoginClick() }
        btn_register.setOnClickListener { viewModel.onRegisterClick() }
    }
}