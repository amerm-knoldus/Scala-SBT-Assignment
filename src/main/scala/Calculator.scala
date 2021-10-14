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

case class Calculator() {

  def add(num1: Int, num2: Int): Int = {
    // require(num1 > 0 && num2 > 0, "This is a simple calculator i.e. given numbers can't be negative")
    num1 + num2
  }

  def subtract(num1: Int, num2: Int): Int = {
    // require(num1 > 0 && num2 > 0, "This is a simple calculator i.e. given numbers can't be negative")
    // require(num1 >= num2, "This calculator can only perform simple subtraction i.e. where first number is" +
    //  " greater than the second number")
    num1 - num2
  }

  def multiplication(num1: Int, num2: Int): Int = {
    // require(num1 > 0 && num2 > 0, "This is a simple calculator i.e. given numbers can't be negative")
    num1 * num2
  }

  def division(num1: Int, num2: Int): Int = {
    // require(num1 > 0 && num2 > 0, "This is a simple calculator i.e. given numbers can't be negative")
    // require(num1 >= num2, "This calculator can only perform simple division i.e. where first number is" +
    //  " greater than the second number")
    require(num2 != 0, "Division by zero is not possible")
    num1 / num2
  }

  def power(base: Int, power: Int): Int = {
    scala.math.pow(base, power).toInt
  }

  def absolute(num: Int): Int = {
    num.abs
  }

  def modulus(num1: Int, num2: Int): Int = {
    // require(num1 >= num2, "This calculator can only perform simple modulus i.e. where first number is" +
    // " greater than the second number")
    require(num2 != 0, "Modulus by zero is not possible")
    num1 % num2
  }

  def maximum(num1: Int, num2: Int): Int = {
    num1 max num2
  }

  def minimum(num1: Int, num2: Int): Int = {
    num1 min num2
  }

}
