// src/main/scala/progscala2/typesystem/valuetypes/type-projection.sc

import progscala2.typesystem.valuetypes._

val l1: Service.Log = new ConsoleLogger
// <console>:13: error: not found: value Service
//        val l1: Service.Log = new ConsoleLogger
//                ^

val l2: Service1.Log = new ConsoleLogger
// <console>:13: error: not found: value Service1
//        val l2: Service1.Log = new ConsoleLogger
//                ^

val l3: Service#Log = new ConsoleLogger
// <console>:13: error: type mismatch;
//  found   : progscala2.typesystem.valuetypes.ConsoleLogger
//  required: progscala2.typesystem.valuetypes.Service#Log
//        val l3: Service#Log = new ConsoleLogger
//                              ^

val l4: Service1#Log = new ConsoleLogger
// l4: progscala2.typesystem.valuetypes.ConsoleLogger =
//   progscala2.typesystem.valuetypes.ConsoleLogger@ea63922
