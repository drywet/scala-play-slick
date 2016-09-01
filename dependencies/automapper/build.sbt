import sbt._

name := """automapper"""
version := "1.0-SNAPSHOT"
scalaVersion := "2.11.6"

lazy val automapper = (project in file("."))
  .settings(
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
  )
