pub trait IntExtensions {
  fn add(& self, b: i32) -> i32;
}

impl IntExtensions for i32 {
  fn add(&self, b: i32) -> i32 {
     self + b
  }
}

fn main() {
   let a = 10;

   println!(" a.add(10) value is {}",a.add(10));
}
