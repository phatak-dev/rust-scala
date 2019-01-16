enum Optional<T> {
 CNone,
 CSome(T)
}

fn main() {
  let int_optional_none:Optional<i32> = Optional::CNone;
  let int_optional_some:Optional<i32> = Optional::CSome(10);

  match int_optional_some {
    Optional::CSome(value) => println!("value is {}", value),
    Optional::CNone => println!("none value")
   }
}
