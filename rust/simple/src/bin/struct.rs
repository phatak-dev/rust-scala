
#[derive(Clone,Hash,Debug,PartialEq)]
struct Person<'a> {
  name : &'a str,
  age : i32 
}

impl<'a> Default  for Person<'a> {
   fn default() -> Person<'a>{
     Person{name:"Anonymous",age:30}
   }
}

fn main() {

  let first_person = Person{name:"jack",age:20};

  let second_person = Person{name:"john", age:30};

  let second_jack = Person{name:"jack", age:20};


  println!("compare first and second person, result is {}", first_person == second_person); 
  println!("compare same person, result is {}", first_person == second_jack); 

  // create clone with different values
  let third_person = first_person.clone();

  // default params

  let default_person:Person = Default::default();
  println!("default values are {:?}", default_person);
}
