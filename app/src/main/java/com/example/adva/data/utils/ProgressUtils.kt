package com.example.adva.data.utils

import android.app.Activity


object ProgressUtils {
    @JvmStatic
    fun showProgress(activity:Activity){
        if (activity is ProgressDisplay) {
            (activity as ProgressDisplay?)!!.showProgress()
        }
    }
    @JvmStatic
    fun hideProgress(activity:Activity){
        if (activity is ProgressDisplay) {
            (activity as ProgressDisplay?)!!.hideProgress()
        }
    }

}