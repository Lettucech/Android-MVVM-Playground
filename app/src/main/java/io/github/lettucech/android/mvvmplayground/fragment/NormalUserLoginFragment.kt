package io.github.lettucech.android.mvvmplayground.fragment

import androidx.navigation.fragment.findNavController

class NormalUserLoginFragment : BaseLoginFragment() {
    override fun goToNextPage() {
        findNavController().navigate(
            NormalUserLoginFragmentDirections.actionNormalUserLoginFragmentToHomeFragment(
                false
            )
        )
    }
}