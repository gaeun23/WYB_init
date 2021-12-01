package com.wyb.wyb_android.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.wyb.wyb_android.R
import com.wyb.wyb_android.base.BindingFragment
import com.wyb.wyb_android.databinding.FragmentChallengeBinding

class ChallengeFragment : BindingFragment<FragmentChallengeBinding>(R.layout.fragment_challenge) {
    private val challengeViewModel by viewModels<ChallengeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding.lifecycleOwner = this@ChallengeFragment
        setChallengeVPAdapter()
        setTabMediator()
        return binding.root
    }

    private fun setChallengeVPAdapter() {
        binding.mainContentVp.adapter = ChallengeAdapter(challengeViewModel)
        binding.mainContentVp.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.mainContentVp.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
    }

    private fun setTabMediator() {
        TabLayoutMediator(binding.challengeContentTab, binding.mainContentVp) { tab, position ->
            tab.text = "나"
        }.attach()
    }
}