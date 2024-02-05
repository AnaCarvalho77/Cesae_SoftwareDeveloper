package com.example.a15_mvvm_menulogin

class PersonRepository {
    fun login (email:String, password: String): Boolean {
        return(email.equals("admin")&& password.equals("pass"))
    }
}