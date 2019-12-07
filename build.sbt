ThisBuild / scalaVersion := "2.12.10"
ThisBuild / organization := "com.init"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val devin = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "Init",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
