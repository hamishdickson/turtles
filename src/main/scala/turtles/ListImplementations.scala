package turtles.list

import cats._
import cats.data._
import cats.implicits._

import turtles.cata._
import turtles.ana._

object instances {
  implicit val listCata = new Cata[List] {
    def cata[A,B](ls: List[A])(b: B)(f: (A,B) => B): B = ls.foldRight(b)(f)
  }

  def ana[A](b: A)(p: A => Boolean)(g: A => A): List[A] = p(b) match {
    case true => Nil
    case false => g(b) :: ana(g(b))(p)(g)
  }
}

object syntax {
  implicit class ListSyntax[A](ls: List[A]) {
    def cata[B](b: B)(f: (A,B) => B)(implicit C: Cata[List]) = C.cata(ls)(b)(f)
  }
}

