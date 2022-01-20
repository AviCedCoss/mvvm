package com.example.mvvm.main.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import com.example.mvvm.main.viewModel.MovieViewModel


val movieModule = module {

    viewModel {
        MovieViewModel(get())
    }

}