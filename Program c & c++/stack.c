#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX_SIZE 5
int stack[MAX_SIZE],top=-1;
int underflow()
{
    if(top==-1){
        return 1;
    }
    else 
    {
        return 0;
    }
}
void pop()
{
    int item ;
    if (top==-1){
        printf("STACK IS UNDERFLOW(EMPTL)");
        return ;
    }
    item=stack[top];
    top-=1;
    printf("THE DELETED ITEM IS=%d",item);
}
int overflow()
{
    if(top==MAX_SIZE-1)
    {
        return 1;
    }
    else{
        return 0;
    }
}
void push(int item)
{
    if (overflow())
    {
        printf("STACK IS OVERFLOW");
        return ;
    }
    top+=1;
    stack[top]=item;
}
void peep()
{
    if (underflow()){
        printf("STACK IS EMPTY:::");
        return ;
    }
    int i ;
    for(i=top;i>=0;i++){
        printf("%d\n",stack[i]);
    }
}
int main ()
{
    int choise,item;
    char ch;
    do {
        printf("\n   Enter the choise ");
        printf("\n1. push to stack ");
        printf("\n2. peep to stack ");
        printf("\n3. push to pop ");
        printf("\n4. push to exit \n");
        scanf("%d",&choise);
        switch(choise)
        {
            case 1:
            printf("Enter the item ");
            scanf("%d",&item);
            push(item);
            break;
            case 2:
            peep();
            break;
            case 3:
            pop();
            break;
            case 4:
            exit(0);
            default:
            printf("wrong choise:--");
        }
        printf("\n Do you continue (y/n)");
        ch=getch();
        putchar(ch);
    }
    while(ch=='y');
}