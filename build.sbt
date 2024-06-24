enablePlugins(ScalaJSPlugin)

organization := "com.thoughtworks.binding"

name := "JsPromiseBinding"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.19" % Test

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.2.0"

enablePlugins(Example)

import meta._
exampleSuperTypes := exampleSuperTypes.value.map {
  case init"_root_.org.scalatest.FreeSpec" =>
    init"_root_.org.scalatest.AsyncFreeSpec"
  case otherTrait =>
    otherTrait
}

exampleSuperTypes += init"_root_.com.thoughtworks.binding.QueueAsyncTestSuite"

jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv()
