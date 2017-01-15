package turtles.laws

import org.scalacheck.Prop
import org.scalatest.{Matchers, FlatSpec}

class CataTest extends FlatSpec with Matchers {
  "A cata" should "obey the fusion law" in {
    /*
     * f . banana(b, |+|) = banana(c, |x|) <= f b = c ^ f (a |+| as) = a |x| (f as)
     */
  }
}
