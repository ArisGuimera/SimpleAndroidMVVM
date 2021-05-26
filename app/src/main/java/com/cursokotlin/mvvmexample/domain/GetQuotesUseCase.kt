package com.cursokotlin.mvvmexample.domain

import com.cursokotlin.mvvmexample.data.QuoteRepository
import com.cursokotlin.mvvmexample.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke() = repository.getAllQuotes()

}