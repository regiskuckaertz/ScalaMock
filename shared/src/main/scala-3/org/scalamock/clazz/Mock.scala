// Copyright (c) ScalaMock Contributors (https://github.com/paulbutcher/ScalaMock/graphs/contributors)
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

package org.scalamock.clazz

import org.scalamock.context.MockContext
import org.scalamock.function.*
import org.scalamock.util.Defaultable

import scala.reflect.Selectable

trait Mock:
  import scala.language.implicitConversions

  inline def mock[T](implicit mockContext: MockContext): T & Selectable = ${MockImpl.mock[T]('{mockContext})}
  inline def stub[T](implicit mockContext: MockContext): T & Selectable = ${MockImpl.stub[T]('{mockContext})}

  inline def mock[T](mockName: String)(implicit mockContext: MockContext) : T & Selectable = ${MockImpl.mockWithName[T]('{mockName})('{mockContext})}
  inline def stub[T](mockName: String)(implicit mockContext: MockContext): T & Selectable = ${MockImpl.stubWithName[T]('{mockName})('{mockContext})}

  inline implicit def toMockFunction0[R: Defaultable](inline f: () => R): MockFunction0[R] = ${MockImpl.toMockFunction0[R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction1[T1, R: Defaultable](inline f: T1 => R): MockFunction1[T1, R] = ${MockImpl.toMockFunction1[T1, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction2[T1, T2, R: Defaultable](inline f: (T1, T2) => R): MockFunction2[T1, T2, R] = ${MockImpl.toMockFunction2[T1, T2, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction3[T1, T2, T3, R: Defaultable](inline f: (T1, T2, T3) => R): MockFunction3[T1, T2, T3, R] = ${MockImpl.toMockFunction3[T1, T2, T3, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction4[T1, T2, T3, T4, R: Defaultable](inline f: (T1, T2, T3, T4) => R): MockFunction4[T1, T2, T3, T4, R] = ${MockImpl.toMockFunction4[T1, T2, T3, T4, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction5[T1, T2, T3, T4, T5, R: Defaultable](inline f: (T1, T2, T3, T4, T5) => R): MockFunction5[T1, T2, T3, T4, T5, R] = ${MockImpl.toMockFunction5[T1, T2, T3, T4, T5, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction6[T1, T2, T3, T4, T5, T6, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6) => R): MockFunction6[T1, T2, T3, T4, T5, T6, R] = ${MockImpl.toMockFunction6[T1, T2, T3, T4, T5, T6, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction7[T1, T2, T3, T4, T5, T6, T7, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7) => R): MockFunction7[T1, T2, T3, T4, T5, T6, T7, R] = ${MockImpl.toMockFunction7[T1, T2, T3, T4, T5, T6, T7, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8) => R): MockFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R] = ${MockImpl.toMockFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9) => R): MockFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R] = ${MockImpl.toMockFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) => R): MockFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R] = ${MockImpl.toMockFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) => R): MockFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R] = ${MockImpl.toMockFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) => R): MockFunction12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R] = ${MockImpl.toMockFunction12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) => R): MockFunction13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] = ${MockImpl.toMockFunction13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) => R): MockFunction14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R] = ${MockImpl.toMockFunction14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) => R): MockFunction15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R] = ${MockImpl.toMockFunction15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) => R): MockFunction16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R] = ${MockImpl.toMockFunction16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) => R): MockFunction17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R] = ${MockImpl.toMockFunction17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) => R): MockFunction18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R] = ${MockImpl.toMockFunction18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) => R): MockFunction19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R] = ${MockImpl.toMockFunction19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) => R): MockFunction20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R] = ${MockImpl.toMockFunction20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) => R): MockFunction21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R] = ${MockImpl.toMockFunction21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toMockFunction22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) => R): MockFunction22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R] = ${MockImpl.toMockFunction22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R]('{f})('{summon[Defaultable[R]]})}

  inline implicit def toStubFunction0[R: Defaultable](inline f: () => R): StubFunction0[R] = ${MockImpl.toStubFunction0[R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction1[T1,  R: Defaultable](inline f: T1 => R): StubFunction1[T1, R] = ${MockImpl.toStubFunction1[T1, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction2[T1, T2, R: Defaultable](inline f: (T1, T2) => R): StubFunction2[T1, T2, R] = ${MockImpl.toStubFunction2[T1, T2, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction3[T1, T2, T3, R: Defaultable](inline f: (T1, T2, T3) => R): StubFunction3[T1, T2, T3, R] = ${MockImpl.toStubFunction3[T1, T2, T3, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction4[T1, T2, T3, T4, R: Defaultable](inline f: (T1, T2, T3, T4) => R): StubFunction4[T1, T2, T3, T4, R] = ${MockImpl.toStubFunction4[T1, T2, T3, T4, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction5[T1, T2, T3, T4, T5, R: Defaultable](inline f: (T1, T2, T3, T4, T5) => R): StubFunction5[T1, T2, T3, T4, T5, R] = ${MockImpl.toStubFunction5[T1, T2, T3, T4, T5, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction6[T1, T2, T3, T4, T5, T6, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6) => R): StubFunction6[T1, T2, T3, T4, T5, T6, R] = ${MockImpl.toStubFunction6[T1, T2, T3, T4, T5, T6, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction7[T1, T2, T3, T4, T5, T6, T7, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7) => R): StubFunction7[T1, T2, T3, T4, T5, T6, T7, R] = ${MockImpl.toStubFunction7[T1, T2, T3, T4, T5, T6, T7, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8) => R): StubFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R] = ${MockImpl.toStubFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9) => R): StubFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R] = ${MockImpl.toStubFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) => R): StubFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R] = ${MockImpl.toStubFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) => R): StubFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R] = ${MockImpl.toStubFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) => R): StubFunction12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R] = ${MockImpl.toStubFunction12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) => R): StubFunction13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] = ${MockImpl.toStubFunction13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) => R): StubFunction14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R] = ${MockImpl.toStubFunction14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) => R): StubFunction15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R] = ${MockImpl.toStubFunction15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) => R): StubFunction16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R] = ${MockImpl.toStubFunction16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) => R): StubFunction17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R] = ${MockImpl.toStubFunction17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) => R): StubFunction18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R] = ${MockImpl.toStubFunction18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) => R): StubFunction19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R] = ${MockImpl.toStubFunction19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) => R): StubFunction20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R] = ${MockImpl.toStubFunction20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) => R): StubFunction21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R] = ${MockImpl.toStubFunction21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R]('{f})('{summon[Defaultable[R]]})}
  inline implicit def toStubFunction22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R: Defaultable](inline f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) => R): StubFunction22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R] = ${MockImpl.toStubFunction22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R]('{f})('{summon[Defaultable[R]]})}

