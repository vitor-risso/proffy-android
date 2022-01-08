package service.teacher

import model.teacher.TeacherResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TeacherService {
    @GET("users/{user}")
    fun getUserInfo(@Path("user") user: String): Call<TeacherResult>
}