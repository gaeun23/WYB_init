package com.wyb.wyb_android.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.wyb.wyb_android.R
import com.wyb.wyb_android.databinding.ItemChallengeContainerBinding

class ChallengeAdapter(val viewModel: ChallengeViewModel) :
    RecyclerView.Adapter<ChallengeAdapter.ChallengeViewHolder>() {

    private val dummyList = arrayListOf("나", "박", "가")

    class ChallengeViewHolder(
        private val binding: ItemChallengeContainerBinding,
        private val challengeViewModel: ChallengeViewModel
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind() {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemChallengeContainerBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.item_challenge_container,
            parent,
            false
        )
        return ChallengeViewHolder(binding, viewModel)
    }

    override fun onBindViewHolder(holder: ChallengeViewHolder, position: Int) {
        dummyList[position]
    }

    override fun getItemCount(): Int = 3

}
