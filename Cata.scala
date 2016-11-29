package cata

/**
  * Catamorphism
  *
  * This implementation is over a list
  */
trait Cata {
  def cata[A, B](ls: List[A], b: B, f: (A, B) => B): B = ls match {
    case Nil => b
    case a :: as => f(a, cata(as, b, f))
  }

  def length[A](ls: List[A]): Int = cata(ls, 0, (_: A, b: Int) => 1 + b)

  def filter[A](ls: List[A])(p: A => Boolean): List[A] =
    cata(ls, Nil, (a: A, b: List[A]) => if(p(a)) a :: b else b)
}
