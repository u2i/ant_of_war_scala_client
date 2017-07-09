package com.u2i.antofwar.game

import com.u2i.antofwar.model.Ant

case class BoardState(myPlayerId: Int, board: IndexedSeq[Int], allAnts: Seq[Ant], foodByPlayerId: Map[Int, Int]) {
  lazy val myAnts: Seq[Ant] = allAnts.filter(_.player == myPlayerId)
  lazy val myFood: Int = foodByPlayerId(myPlayerId)

  //  lazy val board2D =
}
