package com.example.model.service

import com.example.model.dao.{DBConfig, UserDao}

/**
  * Created by yuto on 2016/03/06.
  */
class Users extends DBConfig {
  def find(id: Int) = {
    db.run(UserDao.find)(id)
  }
}
object Users extends Users