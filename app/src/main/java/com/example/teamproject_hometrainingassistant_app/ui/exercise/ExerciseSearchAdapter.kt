package com.example.teamproject_hometrainingassistant_app.ui.exercise

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.teamproject_hometrainingassistant_app.databinding.ItemExersiceSearchBinding

class ExerciseSearchAdapter(private val context: Context) :
    RecyclerView.Adapter<ExerciseSearchAdapter.ViewHolder>() {

    var datas = mutableListOf<ExerciseSearchData>()
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        val binding = ItemExersiceSearchBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(private val binding: ItemExersiceSearchBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: ExerciseSearchData){
            Glide.with(itemView).load(item.img).into(binding.exerciseImageView) // 이미지 연결에 용이한 Glide 라이브러리 사용
            binding.exerciseButton.text = item.text

            binding.exerciseButton.setOnClickListener {
                val intent = Intent(context, ExerciseInformation::class.java)
                intent.run { context.startActivity(this) }
            }
        }
    }
}