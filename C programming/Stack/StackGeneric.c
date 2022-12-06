#include <stdio.h>
#include <string.h>
#define TYPE char
#define PLACEHOLDER "|%c|"
#define SIZE 10 

TYPE stack[SIZE];
int top = 0;

void push(TYPE ele) {
    if (top == SIZE) {
        return;
    }
    stack[top++] = ele;
}

void display () {
    char printStr[8] = "\n";
    strcat(printStr, PLACEHOLDER);
    for (int i = 0; i < top; i++) {
      printf(printStr, stack[top-i-1]); 
    }
   printf("\n -----\n"); 
}

int main()
{
    push('A');
    push('B');
    push('C');
    display();
    return 0;
}
