organization := "com.example"

name := "quill"

version := "0.1.0"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

resolvers ++= Seq(
  "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/",
  "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= {
  Seq(
    "mysql"       %  "mysql-connector-java" % "5.1.36",
    "io.getquill" %% "quill-jdbc" % "0.4.2-SNAPSHOT",
    "com.zaxxer" % "HikariCP" % "2.4.3",
    "com.typesafe" % "config" % "1.3.0"
  )
}
