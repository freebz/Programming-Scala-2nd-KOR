// src/main/scala/progscala2/typesystem/valuetypes/type-types.sc

val s11 = new Service1
val s12 = new Service1

val l1: Logger = s11.logger
// l1: ...valuetypes.Logger = ...valuetypes.ConsoleLogger@f915df9

val l2: Logger = s12.logger
// l2: ...valuetypes.Logger = ...valuetypes.ConsoleLogger@c5ed6df

val l11: s11.logger.type = s11.logger
// l11: s11.logger.type = progscala2.typesystem.valuetypes.ConsoleLogger@f915df9

val l12: s11.logger.type = s12.logger
// <console>:15: error: type mismatch;
//  found   : s12.logger.type (with underlying type progscala2.typesystem.valuetypes.ConsoleLogger)
//  required: s11.logger.type
//        val l12: s11.logger.type = s12.logger
//                                       ^
