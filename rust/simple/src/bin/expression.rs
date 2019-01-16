fn main() {
    let a = 10;

    let is_even = if a % 2 == 0 {true} else {false};
    println!("{} is even {}",a,is_even);    


    let block_result_statement =  {
      1+2;
    };

    println!("block statement result is {:?}",block_result_statement);
    
    let block_result_expression =  {
      1+2
    };

    println!("block expression result is {:?}",block_result_expression);
 
}
