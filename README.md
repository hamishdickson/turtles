# turtles

> A well-known scientist (some say it was Bertrand Russell) once gave a public lecture on astronomy. He described how the earth orbits around the sun and how the sun, in turn, orbits around the center of a vast collection of stars called our galaxy. At the end of the lecture, a little old lady at the back of the room got up and said: "What you have told us is rubbish. The world is really a flat plate supported on the back of a giant tortoise." The scientist gave a superior smile before replying, "What is the tortoise standing on?" "You're very clever, young man, very clever," said the old lady. "But it's turtles all the way down!"

— Hawking, 1988

## Recursive data types for scala

This project really is just for my own learning. Please have a look at [slamdata's matryoshka](https://github.com/slamdata/matryoshka) for working and facinating implementations of these ideas

The implementations in this project are inspired by the classic paper, [Functional Programming with Bananas, Lenses, Envelopes and Barbed Wire](https://pdfs.semanticscholar.org/fec6/b29569eac1a340990bb07e90355efd2434ec.pdf)

## Catamorphism

```scala
scala> import turtles.list.instances._
import turtles.list.instances._

scala> import turtles.list.syntax._
import turtles.list.syntax._

scala> List(1,2,3,4).cata(0)(_ + _)
res1: Int = 10
```

## Anamorphism

```scala
scala> import turtles.list.instances._
import turtles.list.instances._

scala> ana(0)(_ > 10)(_ + 1)
res2: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
```
