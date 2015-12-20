
class BowlingGame(rolls: List[Int]) {
  def score = scoreReduce(0 :: rolls)

  private def scoreReduce(rolls: List[Int]): Int =
    rolls match {
      case total :: Nil
      => total

      case total :: 10 :: second :: third ::Nil
      => total + 10 + second + third

      case total :: first :: second :: third ::Nil if (first + second == 10)
      => total + first + second + third

      case total :: 10 :: second :: third :: rest
      => scoreReduce(total + 10 + second + third :: second :: third :: rest)

      case total :: first :: second :: bonus :: rest if (first + second == 10)
      => scoreReduce(total + first + second + bonus :: bonus :: rest)

      case total :: first :: second :: theRest
      => scoreReduce(total + first + second :: theRest)
    }

}
