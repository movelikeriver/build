lazy val root = (project in file(".")).
  settings(
    name := "scala_fun",
    version := "1.0",
    scalaVersion := "2.11.6",
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-core" % "3.6.1" % "test"
    ),
    resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
    scalacOptions in Test ++= Seq("-Yrangepos")
  )