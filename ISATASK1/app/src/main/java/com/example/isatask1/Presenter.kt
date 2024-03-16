package com.example.isatask1
class LoginPresenter(private val view: LoginView) {

    fun loginUser(username: String, password: String) {
        view.showProgress()

        val userModel = UserModel(username, password)

        if (userModel.isValidCredentials()) {
            view.showLoginSuccessMessage()
        } else {
            view.showLoginErrorMessage()
        }

        view.hideProgress()
    }
}