# Ambiguous Implicit Conversions in Scala

This repository demonstrates a common error in Scala: ambiguous implicit conversions that lead to unexpected results. The `bug.scala` file contains the erroneous code, while `bugSolution.scala` shows how to resolve the ambiguity and achieve the intended behavior.

## Bug Description

The core issue revolves around implicit conversions and how Scala's type system handles them when multiple conversions are possible. This ambiguity can result in compilation errors or unexpected results at runtime.

## Solution

The `bugSolution.scala` file shows how to rectify the error using explicit type annotations and avoiding potential ambiguity.