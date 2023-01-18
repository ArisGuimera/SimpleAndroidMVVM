package com.cursokotlin.mvvmexample.domain

import com.cursokotlin.mvvmexample.data.QuoteRepository
import com.cursokotlin.mvvmexample.domain.model.Quote
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetQuotesUseCaseTest {

    @RelaxedMockK
    private lateinit var quoteRepository: QuoteRepository

    lateinit var getQuotesUseCase: GetQuotesUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getQuotesUseCase = GetQuotesUseCase(quoteRepository)
    }

    @Test
    fun `when the api doesnt return anything then get values from database`() = runBlocking {
        //Given
        coEvery { quoteRepository.getAllQuotesFromApi() } returns emptyList()

        //When
        getQuotesUseCase()

        //Then
        coVerify(exactly = 1) { quoteRepository.getAllQuotesFromDatabase() }
    }

    @Test
    fun `when the api return something then get values from api`() = runBlocking {
        //Given
        val myList = listOf(Quote("Déjame un comentario", "AristiDevs"))
        coEvery { quoteRepository.getAllQuotesFromApi() } returns myList

        //When
        val response = getQuotesUseCase()

        //Then
        coVerify(exactly = 1) { quoteRepository.clearQuotes() }
        coVerify(exactly = 1) { quoteRepository.insertQuotes(any()) }
        coVerify(exactly = 0) { quoteRepository.getAllQuotesFromDatabase() }
        assert(response == myList)
    }
}