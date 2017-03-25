// src/main/scala/progscala2/fp/categories/Functor.scala
package progscala2.fp.categories
import scala.language.higherKinds

trait Functor[F[_]] {
  def map[A, B](fa: F[A])(f: A => B): F[B]
}

object SeqF extends Functor[Seq] {
  def map[A, B](seq: Seq[A])(f: A => B): Seq[B] = seq map f
}

object OptionF extends Functor[Option] {
  def map[A, B](opt: Option[A])(f: A => B): Option[B] = opt map f
}

object FunctionF {
  def map[A,A2,B](func: A => A2)(f: A2 => B): A => B = {
    val functor = new Functor[({type λ[β] = A => β})#λ] {
      def map[A3,B](func: A => A3)(f: A3 => B): A => B = (a: A) => f(func(a))
    }
    functor.map(func)(f)
  }
}
