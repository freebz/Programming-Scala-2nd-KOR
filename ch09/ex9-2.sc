// 9.3 트레이트 쌓기

val button = new Button("Click Me!") with VetoableClicks with ObservableClicks



// new Button("Click Me!") with VetoableClicks with ObservableClicks

def ObservableClicks.click() = {
  if (count < maxAllowed) {          // super.click => Vetoableclicks.click
    count += 1
    {
      updateUI()                     // super.click => Clickable.click
    }
  }
  notifyObservers(this)
}


// new Button("Click Me!") with Observableclicks with Vetoableclicks

def VetoableClicks.click() = {
  if (count < maxAllowed) {          // super.click => Observableclicks.click
    count += 1
    {
      {
        updateUI()                   // super.click => Clickable.click
      }
      notifyObservers(this)
    }
  }
}
