package com.example.model.service

import com.example.model.dao.{DBConfig, UserDao}

/**
  * Created by yuto on 2016/03/06.
  */
class Users extends DBConfig {
  def find(id: Int) = {
    db.run(UserDao.find)(id)
  }

  /**
    * an user name is to be unique.
    * @param name
    * @param age
    * @return
    */
  def insertOrUpdate(name: String, age: Int) = {
    db.transaction{
      val a = db.run(UserDao.findName)(name).headOption
      if (a.isEmpty) db.run(UserDao.insert)(name, age)
      else db.run(UserDao.update)(a.get.id, age)
    }
  }
}
object Users extends Users