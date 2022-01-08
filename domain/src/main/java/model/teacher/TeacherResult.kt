package model.teacher

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeacherResult(
    @Json(name = "login")
    val name: String,
    @Json(name = "avatar_url")
    val picture: String,
    @Json(name = "bio")
    val description: String
)