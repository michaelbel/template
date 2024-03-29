package org.michaelbel.template.fonts

import android.os.Bundle
import android.view.View
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import org.michaelbel.core.ktx.doOnApplyWindowInsets
import org.michaelbel.core.ktx.topPadding
import org.michaelbel.template.fonts.databinding.FragmentFontsBinding

@AndroidEntryPoint
class FontsFragment: Fragment(R.layout.fragment_fonts) {

    private val binding: FragmentFontsBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.appBarLayout.doOnApplyWindowInsets { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.topPadding = systemBars.top
            WindowInsetsCompat.CONSUMED
        }
        binding.toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
    }
}