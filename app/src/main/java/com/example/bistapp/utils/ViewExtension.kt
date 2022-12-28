package com.example.bistapp.utils

import android.content.res.Resources


    fun Int.toPx(): Float = (this * Resources.getSystem().displayMetrics.density)

