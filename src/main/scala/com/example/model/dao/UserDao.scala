package com.example.model.dao

import io.getquill._

case class Users(id: Int, name: String, age: Int)

trait UserDao {

  val find = quote { (id: Int) =>
    query[Users].filter(u => u.id == id)
  }
  val insert = quote {(id: Int, name: String) =>
    query[Users].insert
  }

}
object UserDao extends UserDao