package turtles
package ana

/**
  * Anamorphism
  *
  * aka unfold
  */
trait Ana[F[_]] {
  def ana[A](b: A)(p: A => Boolean)(g: A => A): F[A]
}
