package com.example.model.dao

import io.getquill._

case class Users(id: Int, name: String, age: Int)

trait UserDao {

  val find = quote { (id: Int) =>
    query[Users].filter(u => u.id == id)
  }
  val findName = quote{ (name: String) =>
    query[Users].filter(_.name == name)
  }
  val insert = quote {(name: String, age: Int) =>
    query[Users].insert(_.name -> name, _.age -> age)
  }
  val update = quote { (id: Int, age: Int) =>
    query[Users].filter(_.id == id).update(_.age -> age)
  }

}
object UserDao extends UserDao