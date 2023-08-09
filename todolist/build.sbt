name := """todolist"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.11"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.7"
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.41"
)
libraryDependencies ++= Seq(evolutions, jdbc)
libraryDependencies += "com.typesafe.play" %% "play-jdbc-api" % "2.8.8"
libraryDependencies += "com.h2database" % "h2" % "1.4.200"



// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
