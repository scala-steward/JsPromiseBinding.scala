enablePlugins(ScalaJSPlugin)

organization := "com.thoughtworks.binding"

name := "JsPromiseBinding"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.3" % Test

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.0.1"

enablePlugins(Example)

import meta._
exampleSuperTypes := exampleSuperTypes.value.map {
  case ctor"_root_.org.scalatest.FreeSpec" =>
    ctor"_root_.org.scalatest.AsyncFreeSpec"
  case otherTrait =>
    otherTrait
}

exampleSuperTypes += ctor"_root_.com.thoughtworks.binding.QueueAsyncTestSuite"

jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv()
