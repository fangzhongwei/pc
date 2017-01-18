name := "pc"

version := "1.0"

scalaVersion := "2.11.8"

lazy val commonSettings = Seq(
  javacOptions ++= Seq("-encoding", "UTF-8"),
  organization := "com.lawsofnature.pc",
  version := "1.0",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "net.codingwell" % "scala-guice_2.11" % "4.1.0",
    "org.scala-lang" % "scala-library" % "2.11.8",
    "com.zeroc" % "ice" % "3.6.2"
  )
)

lazy val pccommonlib = (project in file("pccommonlib")).settings(commonSettings: _*).settings(
  name := """pccommonlib""",
  libraryDependencies ++= Seq(
  )
)
lazy val pcclient = (project in file("pcclient")).settings(commonSettings: _*).settings(
  name := """pcclient""",
  libraryDependencies ++= Seq(
    "com.lawsofnature.common" % "common-ice_2.11" % "1.0",
    "com.lawsofnature.pc" % "pccommonlib_2.11" % "1.0"
  )
)

lazy val pcalipay = (project in file("channel/pcalipay")).settings(commonSettings: _*).settings(
  name := """pcalipay""",
  libraryDependencies ++= Seq(
    "com.lawsofnature.common" % "common-ice_2.11" % "1.0",
    "com.lawsofnature.common" % "common-error_2.11" % "1.0",
    "com.lawsofnature.pc" % "pccommonlib_2.11" % "1.0"
  )
)

lazy val pcweixin = (project in file("channel/pcweixin")).settings(commonSettings: _*).settings(
  name := """pcweixin""",
  libraryDependencies ++= Seq(
    "com.lawsofnature.common" % "common-ice_2.11" % "1.0",
    "com.lawsofnature.common" % "common-error_2.11" % "1.0",
    "com.lawsofnature.pc" % "pccommonlib_2.11" % "1.0"
  )
)
lazy val pcyeepay = (project in file("channel/pcyeepay")).settings(commonSettings: _*).settings(
  name := """pcyeepay""",
  libraryDependencies ++= Seq(
    "com.lawsofnature.common" % "common-ice_2.11" % "1.0",
    "com.lawsofnature.common" % "common-error_2.11" % "1.0",
    "com.lawsofnature.pc" % "pccommonlib_2.11" % "1.0"
  )
)