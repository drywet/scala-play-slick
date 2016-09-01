import sbt._
import Keys._

name := """play-scala"""
version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala).dependsOn(automapper)
lazy val automapper = RootProject(file("dependencies/automapper"))

scalaVersion := "2.11.6"

val slickVersion = "3.1.1"


libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % slickVersion,
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick-codegen" % slickVersion,
  "postgresql" % "postgresql" % "9.1-901.jdbc4",
  "com.typesafe.play" % "play-slick_2.11" % "1.1.1",
  //jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
  //"BFil Nexus Snapshots" at "http://nexus.b-fil.com/nexus/content/repositories/snapshots/",
  Resolver.sonatypeRepo("releases")
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

import com.typesafe.config.ConfigFactory
import sbt._
import Keys._
import Tests._

val config = ConfigFactory.parseFile(new File("conf/application.conf"))

lazy val slick = TaskKey[Seq[File]]("gen-tables")
lazy val slickCodeGenTask = (baseDirectory, dependencyClasspath in Compile, runner in Compile, streams) map { (dir, cp, r, s) =>
  val pkg = ""
  val pkgDir = "app/models"
  val outputDir = (dir / pkgDir).getPath // place generated files in sbt's managed sources folder
  val url = config.getString("slick.dbs.default.db.url")
  val jdbcDriver = config.getString("slick.dbs.default.db.driver")
  val slickDriver = config.getString("slick.dbs.default.driver")
  toError(r.run("slick.codegen.SourceCodeGenerator", cp.files, Array(slickDriver, jdbcDriver, url, outputDir, pkg), s.log))
  val fname = outputDir + s"/${pkgDir}/Tables.scala"
  Seq(file(fname))
}

slick <<= slickCodeGenTask // register manual sbt command