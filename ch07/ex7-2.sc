// 7.3 for 내장의 변환 규칙

// pat <- expr
pat <- expr.withFilter { case pat => true; case _ => false }


// for (pat <- expr1 ) yeild expr2
expr1 map { case pat => expr2 }


// for ( pat <- expr1 ) expr2
expr1 foreach { case pat => expr2 }


// for ( pat1 <- expr1; pat2 <- expr2; ... ) yeild exprN
expr1 flatMap { case pat1 => for (pat2 <- expr2 ...) yeild exprN }


// for ( pat1 <- expr1; pat2 <- expr2; ... ) exprN
expr1 foreach { case pat1 => for (pat2 <- expr2 ..) yeild exprN }


// pat1 <- expr1 if guard
pat1 <- expr1 withFilter ((arg1, arg2, ...) => guard)


// pat1 <- expr1; pat2 = expr2
(pat1, pat2) <- for {
  x1 @ pat1 <- expr1
} yield {
  val x2 @ pat2 = expr2
  (x1, x2)
}


val z @ (x, y) = (1 -> 2)
