package com.example.progrespkl.Model

import com.google.gson.annotations.SerializedName

data class Warungkopi(

    @SerializedName("space_name")
    val space_name: String ?,

    @SerializedName("space_address")
    var space_address: String?,
    @SerializedName("space_description")
    var space_description: String?,
    @SerializedName("space_photo")
    var space_photo: String ?

)