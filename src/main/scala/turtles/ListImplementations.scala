package turtles.list

import cats._
import cats.data._
import cats.implicits._

import turtles.cata._

object syntax {
  implicit val listCata = new Cata[List] {
    def cata[A,B](ls: List[A])(b: B)(f: (A,B) => B): B = ls.foldRight(b)(f)
  }

  implicit class ListSyntax[A](ls: List[A]) {
    def cata[B](b: B)(f: (A,B) => B)(implicit C: Cata[List]) = C.cata(ls)(b)(f)
  }
}

