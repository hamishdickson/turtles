package turtles
package cata

/**
  * Catamorphism
  *
  * aka fold
  */
trait Cata[F[_]] {
  def cata[A, B](ls: F[A])(b: B)(f: (A, B) => B): B
}
