trait Display {
  fn display(&self);
}

struct StringDisplay {}

struct IntDisplay {}

impl Display for StringDisplay {

 fn display(&self) {
   println!(" string display")
 }

}

impl Display for IntDisplay {
 fn display(&self) {
   println!(" int display")
 }
}

fn display(d: &Display) {
  d.display();
}


fn main() {

 let str_display = StringDisplay{};
 display(&str_display);

 let int_display = IntDisplay{};
 display(&int_display);

}

