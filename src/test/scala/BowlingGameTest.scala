import org.scalatest.{BeforeAndAfter, FunSuite}

class BowlingGameTest extends FunSuite with BeforeAndAfter {



  test("peut faire une partie médiocre") {
    val partie = new BowlingGame(List.fill(20)(0))

    assert(partie.score == 0)
  }


  test("peut faire une partie sans cas particulier") {
    val partie = new BowlingGame(List.fill(20)(1))

    assert(partie.score == 20)
  }

  test("peut faire un spare") {
    val partie = new BowlingGame(List(3, 7, 2) ::: List.fill(17)(0))

    assert(partie.score == 14)
  }

  test("peut faire un strike") {
    val partie = new BowlingGame(List(10, 2, 2) ::: List.fill(16)(0))

    assert(partie.score == 18)
  }

  test("peut faire une partie parfaite") {
    val partie = new BowlingGame(List.fill(12)(10))

    assert(partie.score == 300)
  }

  test("peut faire un spare à la fin") {
    val partie = new BowlingGame(List.fill(18)(0):::List(7, 3, 2))

    assert(partie.score == 12)
  }
}
