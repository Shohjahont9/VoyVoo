package uz.lars_lion.voyvoo.ui.top

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.lars_lion.voyvoo.base.BaseFragment
import uz.lars_lion.voyvoo.databinding.FragmentTopBinding

class TopFragment :BaseFragment<FragmentTopBinding>() {
    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentTopBinding  =
        FragmentTopBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}