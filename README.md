# ExempleStrategy1251
## Sebastien
```mermaid
classDiagram
direction BT
class AgressifBehaviour {
  + AgressifBehaviour() 
  + moveCommand() int
}
class DefensifBehaviour {
  + DefensifBehaviour() 
  + moveCommand() int
}
class IBehaviour {
<<Interface>>
  + moveCommand() int
}
class Main {
  + Main() 
  + main(String[]) void
}
class NormalBehaviour {
  + NormalBehaviour() 
  + moveCommand() int
}
class Robot {
  + Robot(String) 
  + Robot(Robot) 
  + Robot(String, IBehaviour) 
  + Robot() 
  - String nom
  - IBehaviour behaviour
  + move() void
  + toString() String
   String nom
   IBehaviour behaviour
}

AgressifBehaviour  ..>  IBehaviour 
DefensifBehaviour  ..>  IBehaviour 
Main  ..>  AgressifBehaviour : «create»
Main  ..>  DefensifBehaviour : «create»
Main  ..>  NormalBehaviour : «create»
Main  ..>  Robot : «create»
NormalBehaviour  ..>  IBehaviour 
Robot "1" *--> "behaviour 1" IBehaviour 
```
