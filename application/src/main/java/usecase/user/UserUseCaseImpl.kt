package usecase.user

import com.ciandt.cardmanager.extensions.toRequestResult
import com.ciandt.cardmanager.service.handlers.RequestResultSuccess
import model.teacher.TeacherModel
import service.teacher.TeacherService

class UserUseCaseImpl(private val teacherService: TeacherService) : UserUseCase {

    override suspend fun getUser(name: String): TeacherModel {
        var teacherModel: TeacherModel? = null
        when (val result = teacherService.getUserInfo(name).toRequestResult()) {
            is RequestResultSuccess -> {
                result.data.body()?.let {
                    return TeacherModel(
                        it.name,
                        it.description,
                        picture = it.picture
                    )
                }
            }
        }
        return TeacherModel("default", "default", picture = "default")
    }
}