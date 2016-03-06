package com.example.model.dao

import io.getquill._
import io.getquill.naming.SnakeCase
import io.getquill.sources.sql.idiom.MySQLDialect

class DBConfig {
  lazy val db = source(new JdbcSourceConfig[MySQLDialect, SnakeCase]("db"))
}
