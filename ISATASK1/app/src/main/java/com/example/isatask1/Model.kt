package com.example.isatask1
class UserModel(private val username: String, private val password: String) {

    fun isValidCredentials(): Boolean {
        // Perform validation logic here, e.g., check against database
        return username == "admin" && password == "admin123"
    }
}