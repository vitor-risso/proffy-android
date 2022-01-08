package model.teacher

data class TeacherModel(
    val name: String,
    val description: String,
    val isFavorite: Boolean = false,
    val cost: String = "0",
    val subject: String = "",
    val picture: String,
    val telephoneNumber: String = ""
)