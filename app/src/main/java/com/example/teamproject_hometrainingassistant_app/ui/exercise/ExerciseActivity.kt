package com.example.teamproject_hometrainingassistant_app.ui.exercise

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import com.example.teamproject_hometrainingassistant_app.R
import com.example.teamproject_hometrainingassistant_app.R.drawable.ic_photo
import com.example.teamproject_hometrainingassistant_app.databinding.ActivityExerciseBinding
import com.example.teamproject_hometrainingassistant_app.ui.community.CommunityAdapter
import com.example.teamproject_hometrainingassistant_app.ui.community.CommunityData
import com.example.teamproject_hometrainingassistant_app.ui.dashboard.Decorator.HorizontalItemDecorator
import com.example.teamproject_hometrainingassistant_app.ui.dashboard.Decorator.VerticalItemDecorator
import com.example.teamproject_hometrainingassistant_app.ui.home.HomeFragment

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityExerciseBinding
class ExerciseActivity : AppCompatActivity() {

    lateinit var exerciseOptionAdapter: ExerciseOptionAdapter
    lateinit var exerciseCategoryAdapter: ExerciseCategoryAdapter
    lateinit var exerciseSearchAdapter: ExerciseSearchAdapter

    val optionDatas = mutableListOf<ExerciseOptionData>()
    val categoryDatas = mutableListOf<ExerciseCategoryData>()
    val searchDatas = mutableListOf<ExerciseSearchData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        binding.searchView.isSubmitButtonEnabled = true
        setContentView(binding.root)

        OptionRecycler()
        CategoryRecycler()
        SearchRecycler()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun OptionRecycler(){
        exerciseOptionAdapter = ExerciseOptionAdapter(this)
        binding.exerciseOptionRecyclerView.adapter = exerciseOptionAdapter
        binding.exerciseOptionRecyclerView.addItemDecoration(HorizontalItemDecorator(0))

        optionDatas.apply {
            add(ExerciseOptionData(text = "????????????"))
            add(ExerciseOptionData(text = "????????????"))
            add(ExerciseOptionData(text = "??????"))
            add(ExerciseOptionData(text = "?????????"))
            exerciseOptionAdapter.datas = optionDatas
            exerciseOptionAdapter.notifyDataSetChanged()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun CategoryRecycler(){
        exerciseCategoryAdapter = ExerciseCategoryAdapter(this)
        binding.exerciseCategoryRecyclerView.adapter = exerciseCategoryAdapter
        binding.exerciseCategoryRecyclerView.addItemDecoration(HorizontalItemDecorator(0))

        categoryDatas.apply {
            add(ExerciseCategoryData(text = "??????"))
            add(ExerciseCategoryData(text = "???"))
            add(ExerciseCategoryData(text = "??????"))
            add(ExerciseCategoryData(text = "??????"))
            add(ExerciseCategoryData(text = "??????"))
            add(ExerciseCategoryData(text = "??????"))
            add(ExerciseCategoryData(text = "??????"))
            add(ExerciseCategoryData(text = "??????"))

            exerciseCategoryAdapter.datas = categoryDatas
            exerciseCategoryAdapter.notifyDataSetChanged()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun SearchRecycler(){
        exerciseSearchAdapter = ExerciseSearchAdapter(this)
        binding.exerciseSearchRecyclerView.adapter = exerciseSearchAdapter
        binding.exerciseSearchRecyclerView.addItemDecoration(VerticalItemDecorator(0))

        searchDatas.apply {
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "?????????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "?????? ???"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "????????? ????????????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "????????? ????????????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "????????? ??????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "?????????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "??????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "?????????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "?????????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "?????????"))
            add(ExerciseSearchData(img = R.drawable.ic_photo, text = "?????????"))
            exerciseSearchAdapter.datas = searchDatas
            exerciseSearchAdapter.notifyDataSetChanged()
        }
    }
}