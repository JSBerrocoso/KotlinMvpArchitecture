package com.burakeregar.kotlinmvparchitecture.home.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Burak Eregar on 23.05.2017.
 * burakeregar@gmail.com
 * https://github.com/burakeregar
 */
class MarsPhotos {
    @SerializedName("photos")
    @Expose
    var photoList: List<MarsItem>? = null
}

class MarsItem {
    @SerializedName("img_src")
    @Expose
    var image: String? = null

    @SerializedName("earth_date")
    @Expose
    var date: String? = null
}