// CHAPTER 5 암시

// 5.1 암시적 인자

def calcTax(amount: Float)(implicit rate: Float): Float = amount * rate


implicit val currentTaxRate = 0.08F
//...
val tax = calcTax(50000F) // 4000.0
