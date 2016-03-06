package com.example.model.dao

import io.getquill._


case class Users(id: Int, name: String, age: Int)

/**
  * CREATE TABLE `users` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
  */
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