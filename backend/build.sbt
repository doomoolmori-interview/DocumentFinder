ThisBuild / scalaVersion     := "3.3.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

val zioVersion = "2.1.1"
val zioHttpVersion = "3.0.0-RC8"
val zioJsonVersion = "0.7.0"
val zioConfigVersion = "4.0.2"
val tsidVersion = "2.1.2"

val sttpCoreVersion = "4.0.0-M16"
val sttpZIOVersion = "4.0.0-M16"
val sttpZIOJsonVersion = "4.0.0-M16"


lazy val root = (project in file("."))
  .settings(
    name := "backend",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioVersion,
      "dev.zio" %% "zio-test" % zioVersion % Test,
      "dev.zio" %% "zio-http" % zioHttpVersion,
      "dev.zio" %% "zio-json" % zioJsonVersion,
      "dev.zio" %% "zio-config" % zioConfigVersion,
      "dev.zio" %% "zio-config-typesafe" % zioConfigVersion,

      "com.softwaremill.sttp.client4" %% "core" % sttpCoreVersion,
      "com.softwaremill.sttp.client4" %% "zio" % sttpZIOVersion,
      "com.softwaremill.sttp.client4" %% "zio-json" % sttpZIOJsonVersion,
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
