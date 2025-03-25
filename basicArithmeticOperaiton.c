#include <stdio.h>

void arithmeticOperaion(int a, int b){
  printf(" add : %d",(a+b));
  printf(" sub : %d",(a-b));
  printf(" mult : %d",(a*b));
  printf(" div : %d",(a/b));
}

int main(){
  int a=10,b=5;
  printf("enter the value of a and b");
 
  arithmeticOperaion(a,b);
  return 0;
}
