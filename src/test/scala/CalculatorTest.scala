// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CalculatorTest extends AnyWordSpec  with Matchers {

  "Creating a Calculator" should {
    // Do nothing
    "instantiate the Calculator class correctly" in {
      val c = Calculator()
      c equals Calculator()
    }
  }

  "The Add operation method" should {
    val c = Calculator()
    "add two positive numbers correctly" in {
      val num1 = 2
      val num2 = 10
      val expectedRes = 12

      c add(num1, num2) shouldEqual expectedRes
    }
    "add two negative numbers correctly" in {
      val num1 = -10
      val num2 = -5
      val expectedRes = -15

      c add(num1, num2) shouldEqual expectedRes
    }
    "add a negative and positive number correctly" in {
      val num1 = 4
      val num2 = -5
      val expectedRes = -1

      c add(num1, num2) shouldEqual expectedRes
    }
  }

  "The Subtract operation method" should {
    val c = Calculator()
    "subtract two positive numbers correctly" in {
      val num1 = 10
      val num2 = 2
      val expectedRes = 8

      c subtract(num1, num2) shouldEqual expectedRes
    }
    "subtract two negative numbers correctly" in {
      val num1 = -10
      val num2 = -5
      val expectedRes = -5

      c subtract(num1, num2) shouldEqual expectedRes
    }
    "subtract a negative and positive number correctly" in {
      val num1 = 4
      val num2 = -5
      val expectedRes = 9

      c subtract(num1, num2) shouldEqual expectedRes
    }
  }

  "The Multiplication operation method" should {
    val c = Calculator()
    "multiply two positive numbers correctly" in {
      val num1 = 10
      val num2 = 2
      val expectedRes = 20

      c multiplication (num1, num2) shouldEqual expectedRes
    }
    "multiply two negative numbers correctly" in {
      val num1 = -10
      val num2 = -5
      val expectedRes = 50

      c multiplication (num1, num2) shouldEqual expectedRes
    }
    "multiply a negative and positive number correctly" in {
      val num1 = 4
      val num2 = -5
      val expectedRes = -20

      c multiplication (num1, num2) shouldEqual expectedRes
    }
  }

  "The Division operation method" should {
    val c = Calculator()
    "divide two positive numbers correctly" in {
      val num1 = 10
      val num2 = 2
      val expectedRes = 5

      c division (num1, num2) shouldEqual expectedRes
    }
    "divide two negative numbers correctly" in {
      val num1 = -10
      val num2 = -5
      val expectedRes = 2

      c division (num1, num2) shouldEqual expectedRes
    }
    "divide a negative and positive number correctly" in {
      val num1 = 8
      val num2 = -2
      val expectedRes = -4

      c division (num1, num2) shouldEqual expectedRes
    }
    "throw an IllegalArgumentException when division by zero" in {
      val num1 = 8
      val num2 = 0

      an[IllegalArgumentException] should be thrownBy c.division(num1, num2)
    }
  }

  "The Power operation method" should {
    val c = Calculator()
    "calculate a positive base with a positive power correctly" in {
      val base = 2
      val pow = 3
      val expectedRes = 8

      c power (base, pow) shouldEqual expectedRes
    }
    "calculate a negative base with a positive even power correctly" in {
      val base = -2
      val pow = 6
      val expectedRes = 64

      c power (base, pow) shouldEqual expectedRes
    }
    "calculate a negative base with a positive odd power correctly" in {
      val base = -2
      val pow = 5
      val expectedRes = -32

      c power (base, pow) shouldEqual expectedRes
    }
  }

  "The Absolute operation method" should {
    val c = Calculator()
    "calculate the absolute value of a positive number correctly" in {
      val num = 2
      val expectedRes = 2

      c absolute(num) shouldEqual expectedRes
    }
    "calculate the absolute value of a negative number correctly" in {
      val num = -4
      val expectedRes = 4

      c absolute(num) shouldEqual expectedRes
    }
  }

  "The Modulus operation method" should {
    val c = Calculator()
    "calculate the modulus of two positive numbers correctly" in {
      val num1 = 12
      val num2 = 2
      val expectedRes = 0

      c modulus (num1, num2) shouldEqual expectedRes
    }
    "calculate the modulus of two negative numbers correctly" in {
      val num1 = -17
      val num2 = -3
      val expectedRes = -2

      c modulus (num1, num2) shouldEqual expectedRes
    }
    "calculate the modulus of a positive and negative number correctly" in {
      val num1 = -4
      val num2 = 2
      val expectedRes = 0

      c modulus (num1, num2) shouldEqual expectedRes
    }
    "throw an IllegalArgumentException when modulus by zero" in {
      val num1 = 8
      val num2 = 0

      an[IllegalArgumentException] should be thrownBy c.modulus(num1, num2)
    }
  }

  "The Maximum operation method" should {
    val c = Calculator()
    "calculate the maximum of two positive numbers correctly" in {
      val num1 = 10
      val num2 = 2
      val expectedRes = 10

      c maximum (num1, num2) shouldEqual expectedRes
    }
    "calculate the maximum of two negative numbers correctly" in {
      val num1 = -5
      val num2 = -1
      val expectedRes = -1

      c maximum (num1, num2) shouldEqual expectedRes
    }
    "calculate the maximum of a positive and a negative number correctly" in {
      val num1 = -1
      val num2 = 1
      val expectedRes = 1

      c maximum (num1, num2) shouldEqual expectedRes
    }
  }

  "The Minimum operation method" should {
    val c = Calculator()
    "calculate the minimum of two positive numbers correctly" in {
      val num1 = 10
      val num2 = 2
      val expectedRes = 2

      c minimum (num1, num2) shouldEqual expectedRes
    }
    "calculate the minimum of two negative numbers correctly" in {
      val num1 = -5
      val num2 = -1
      val expectedRes = -5

      c minimum (num1, num2) shouldEqual expectedRes
    }
    "calculate the minimum of a positive and a negative number correctly" in {
      val num1 = -1
      val num2 = 1
      val expectedRes = -1

      c minimum (num1, num2) shouldEqual expectedRes
    }

  }
}
