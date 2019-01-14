fn add( a: i32, b : i32) -> i32 {
    a + b
}


fn main() {
    //normal type inference
    let _a = 10;
    
    /* assert!(a != 10.0, "not a int");
     * prints can't compare `{integer}` with `{float}` 
     */

    //collection type inferece 
    let _vector = vec!(10,20,30,40);

    /* _vector.push(10.0);
     * Prints expected integral variable, found floating-point variable
     */

    println!("add two numbers {}" , add(10,20));
}
