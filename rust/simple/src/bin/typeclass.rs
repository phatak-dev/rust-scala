use std::borrow::Cow;
use std::vec::Vec;

pub trait Serializable<'a> {
 fn serialize(self : &Self) -> Cow<'a,str>; 
}

struct Person<'a> {
  name : &'a str,
  age : i32 
}
struct Restaurant<'a> {
  name : &'a str,
  brunch : bool
}


impl<'a> Serializable<'a> for Person<'a> {
  fn serialize( self: &Self) -> Cow<'a,str> {
     Cow::Owned(self.name.to_owned()+" "+ &self.age.to_string())
  }
}
impl<'a> Serializable<'a> for Restaurant<'a> {
  fn serialize( self: &Self) -> Cow<'a,str> {
     Cow::Owned(self.name.to_owned()+" "+ &self.brunch.to_string())
  }
}
impl<'a,T:Serializable<'a>> Serializable<'a> for Vec<T> {
  fn serialize( self: &Self) -> Cow<'a,str> {
      let result = self.iter().map(|x| serialize_method(x)).collect::<Vec<Cow<'a,str>>>();
      let join_result = result.join(",");
       Cow::Owned(join_result)
  }
}

pub fn serialize_method<'a,T>(v:&T) -> Cow<'a,str> where T:Serializable<'a> {
  T::serialize(v) 
}

fn main() {
   let s = Person { name:"hello", age:32};
   let r = Restaurant { name:"hello", brunch:true};
   let vector = vec!(Person{name:"hack", age:40});

   println!("{}",serialize_method(&s));
   println!("{}",serialize_method(&r));
   println!("{}",serialize_method(&vector));
}
