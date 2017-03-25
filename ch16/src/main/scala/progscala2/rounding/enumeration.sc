// src/main/scala/progscala2/rounding/enumeration.sc

object Breed extends Enumeration {
  type Breed = Value
  val doberman = Value("Doberman Pinscher")
  val yorkie   = Value("Yorkshire Terrier")
  val scottie  = Value("Scottish Terrier")
  val dane     = Value("Great Dane")
  val portie   = Value("Portuguese Water Dog")
}


sealed trait Breed { val name: String }
case object doberman extends Breed { val name = "Doberman Pinscher" }
case object yorkie   extends Breed { val name = "Yorkshire Terrier" }
case object scottie  extends Breed { val name = "Scottish Terrier" }
case object dane     extends Breed { val name = "Great Dane" }
case object portie   extends Breed { val name = "Portuguese Water Dog" }
