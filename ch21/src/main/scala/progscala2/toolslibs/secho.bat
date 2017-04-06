::#!
@echo off
call scala %0 %*
goto :eof
::!#
print("You entered: ")
args.toList foreach { s => printf("%s ", s) }
println
