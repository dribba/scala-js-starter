package com.asurion.objects

import org.scalajs.dom
import scala.scalajs.js

object Main {

  def main(args: Array[String]): Unit = {
    println("Starting game...")

    GameEngine.init()
    GameEngine.startGameLoop()

    println("Game started!")
  }

}

object GameEngine {
  def init() = {}
  def update(delta: Double) = {}
  def render() = {}
  def startGameLoop() = {}
}

object Game {
  var rolls = Array.empty[Int]
  def rollAgain() = {}
}
