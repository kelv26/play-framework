name := """todolist"""
organization := "com.example"

version := "1.0-SNAPSHOT"
val AkkaVersion = "2.6.21"
val AkkaHttpVersion = "10.2.10"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.11"

libraryDependencies += "com.typesafe.play" %% "play" % "2.8.18"
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.10"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "8.0.33"
)
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
libraryDependencies ++= Seq(evolutions, jdbc)
libraryDependencies += "com.typesafe.play" %% "play-jdbc-api" % "2.8.18"
libraryDependencies += "com.h2database" % "h2" % "2.1.214"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
