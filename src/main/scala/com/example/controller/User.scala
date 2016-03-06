package com.example.controller

import com.example.model.service.Users
object User {
  def main(args: Array[String]) {
    println(Users.insertOrUpdate("aaa", 1323))
  }

}
