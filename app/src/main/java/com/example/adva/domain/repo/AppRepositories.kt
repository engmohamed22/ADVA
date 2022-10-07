package com.example.adva.domain.repo

import android.content.Context
import com.example.adva.data.models.ImagesResponseItem
import com.example.adva.data.network.ApiInterface
import com.example.adva.data.network.SafeApiRequest
import com.example.adva.data.utils.Constants
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class AppRepository @Inject constructor(
    private val context: Context,
    private val api: ApiInterface,
) {
    suspend fun getImages(pageNo: Int): List<ImagesResponseItem> {
        return withContext(Dispatchers.IO) {
            SafeApiRequest.apiRequest(context) {
                api.getImages( pageNo, Constants.PAGE_ITEM)
            }
        }
    }

}