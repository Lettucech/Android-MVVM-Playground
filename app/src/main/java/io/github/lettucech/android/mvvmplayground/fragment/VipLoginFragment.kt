package io.github.lettucech.android.mvvmplayground.fragment

import androidx.navigation.fragment.findNavController

class VipLoginFragment : BaseLoginFragment() {
    override fun goToNextPage() {
        findNavController().navigate(
            VipLoginFragmentDirections.actionVipLoginFragmentToHomeFragment(
                true
            )
        )
    }
}