package usecase.user

import model.teacher.TeacherModel

interface UserUseCase {
    suspend fun getUser(name: String): TeacherModel
}