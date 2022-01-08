package di

import org.koin.dsl.module
import usecase.user.UserUseCase
import usecase.user.UserUseCaseImpl

val useCaseModule = module {
    single<UserUseCase> {
        UserUseCaseImpl(get())
    }
}