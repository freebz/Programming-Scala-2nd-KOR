// 14.4 뷰 바운드

class C[A] {
  def m1[B](...)(implicit view: A => B): ReturnType = {...}
  def m2[A <% B](...): ReturnType = {...}
}
